import java.util.*;
class Solution {
    static boolean visit [];
    static ArrayList<Integer> A[];
    static int [] dis;
    public int solution(int n, int[][] edge) {
        int answer = 0;
        visit = new boolean[n+1];
        A = new ArrayList[n+1];
        dis = new int [n+1];
        for(int i=1;i<=n;i++){
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0;i<edge.length;i++){
            int S = edge[i][0];
            int E = edge[i][1];
            A[S].add(E);
            A[E].add(S);
        }
        BFS();
        int max =-1;
        int index =-1;
        for(int i=1;i<dis.length;i++){
            if(max<dis[i]) {
                max = dis[i];
                index = i;
                answer =0;
                
            } 
            else if(max ==dis[i]){
                answer++;
            }
        }
        
        return answer+1;
    }
    private static void BFS(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visit[1] = true;
        while(!queue.isEmpty()){
            int v = queue.poll();
            for(int i:A[v]){
              if(!visit[i]){
                  queue.add(i);
                  visit[i] = true;
                  dis[i] = dis[v]+1;
              }  
            }
        }

    }
}