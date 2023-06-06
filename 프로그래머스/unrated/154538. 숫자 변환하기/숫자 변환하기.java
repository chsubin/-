import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer =BFS(x,y,n);
        return answer;
    }
    private static int BFS(int x, int y, int n){
        boolean [] visit = new boolean [1000001];
        Queue<int []> queue = new LinkedList<>();
        queue.add(new int []{x,0});
        while(!queue.isEmpty()){
            int [] A = queue.poll();
            int su = A[0];
            int depth = A[1];
            
            if(su ==y){return depth;}
            if(su*2<=y&&!visit[su*2]){
                queue.add(new int[]{su*2,depth+1});visit[su*2] = true;
            }
            if(su*3<=y&&!visit[su*3]){
                queue.add(new int[]{su*3,depth+1});
                visit[su*3] = true;
            }
            if(su+n<=y&&!visit[su+n]){
                queue.add(new int[]{su+n,depth+1}); 
                visit[su+n] = true;
            }
        }
        return -1;
        
    }
}