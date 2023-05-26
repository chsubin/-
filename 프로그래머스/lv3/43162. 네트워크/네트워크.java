import java.util.*;
class Solution {
    static ArrayList<Integer> A[];
    static boolean visit[];
    public int solution(int n, int[][] computers) {
        int answer = 0;
        A = new ArrayList[n];
        visit = new boolean[n];
        for(int i=0;i<computers.length;i++){
            A[i] = new ArrayList<>();
            for(int j=0;j<computers.length;j++){
                if(computers[i][j] ==1){
                    A[i].add(j);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(!visit[i]){
                answer++;
                DFS(i);
            }
            
        }
        
        
        
        return answer;
    }
    public static void DFS(int i){
        if(visit[i]) return;
        visit[i] = true;
        for(int v:A[i]){
            DFS(v);
        }
        
    }
}