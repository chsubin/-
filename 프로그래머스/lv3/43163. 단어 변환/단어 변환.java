import java.util.*;
class Solution {
    static boolean visit[];
    static String word[];
    static int answer=0;
    public int solution(String begin, String target, String[] words) {
        word = words;
        visit = new boolean[words.length];
        
        BFS(begin,target);
        
        return answer;
    }
    private static void BFS(String begin,String target){
        Queue<Node> queue = new LinkedList<>();
        
        for(int i=0;i<word.length;i++){
            int su =0;
            for(int j=0;j<begin.length();j++){
                if(!word[i].substring(j,j+1).equals(begin.substring(j,j+1))) su++;
            }
            if(su ==1) {queue.add(new Node(i,1));}
        }
        while(!queue.isEmpty()){
            Node node = queue.poll();
            String str = word[node.index];
            int depth = node.depth;
            if(visit[node.index]) continue;
            visit[node.index] = true;
            if (str.equals(target)) {answer = depth;System.out.println(str);return;}
            
            for(int i=0;i<word.length;i++){
                if(!visit[i]){
                    int su =0;
                    for(int j=0;j<str.length();j++){
                        if(!word[i].substring(j,j+1).equals(str.substring(j,j+1))) su++;
                    }
                    if(su ==1) {queue.add(new Node(i,depth+1));}
                }
            }
            
        }
        
    }
}
class Node{
    int index;
    int depth;
    Node(int index, int depth){
        this.index = index;
        this.depth = depth;
    }
    
}