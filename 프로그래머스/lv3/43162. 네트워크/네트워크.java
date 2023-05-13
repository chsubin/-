import java.util.*;
class Solution {
    static ArrayList<Integer> [] A;
    static boolean visit[] ;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        A =  new ArrayList[computers.length];
        visit = new boolean[A.length];
        
        for(int i=0;i<computers.length;i++){
            A[i] = new ArrayList<Integer>();
            for(int j=0;j<computers.length;j++){
                int S = i;
                int E = j;
                if(S!=E&&computers[S][E]==1){
                A[S].add(E);
                }
            }
        }
        for(int i=0;i<computers.length;i++){
            if(!visit[i]){
                DFS(i);
                answer++;
            }
            
        }
        
        
        return answer;
    }
    private static void DFS(int now){
        if(visit[now]) return;
        System.out.println(now);
        visit[now] = true;
        for(int i:A[now]){
            if(!visit[i]){
                DFS(i);
            }
        }
        
        
        
        
    }
}