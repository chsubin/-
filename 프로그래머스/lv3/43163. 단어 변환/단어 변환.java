import java.util.*;
class Solution {
    static boolean visit[];
    static int answer = 101;
    public int solution(String begin, String target, String[] words) {
        visit = new boolean[words.length];
        BFS(begin,target,words);
        
        return answer==101?0:answer;
    }
    public static void BFS(String begin, String target,String[]words){
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<words.length;i++){
            if(go(words[i],begin)) queue.add(new int []{i,1});
        }
        while(!queue.isEmpty()){
            int [] A = queue.poll();
            int index = A[0];
            int depth = A[1];
            if(visit[index]) continue;
            visit[index] = true;
            if(words[index].equals(target)) {answer = depth; return;}
            for(int i=0;i<words.length;i++){
                if(go(words[index],words[i])) queue.add(new int[]{i,depth+1});
            }  
        }
    }
    public static boolean go(String str1, String str2){
        int su = 0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                su++;
            }
        }
        if(su==1) return true;
        else return false;  
    }
}