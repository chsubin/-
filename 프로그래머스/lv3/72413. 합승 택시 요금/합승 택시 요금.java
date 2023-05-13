import java.util.*;
class Solution {
    static int distance[][]; //출발/a의집/b의집
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = 0;
        distance = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j) distance[i][j]=0;
                else distance[i][j] = 10000001;
            }
        }
        
        for(int i=0;i<fares.length;i++){
            int S = fares[i][0];
            int E = fares[i][1];
            int V = fares[i][2];
            if(distance[S][E]>V) distance[S][E] = V;
            if(distance[E][S]>V) distance[E][S] = V;
            }
        for(int k=1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    distance[i][j] = Math.min(distance[i][j],distance[i][k]+distance[k][j]);
                }
            }
        }
        answer = 10000001;
        for(int k=1;k<=n;k++){
            answer = Math.min(answer,distance[s][k]+distance[k][a]+distance[k][b]);
        }
        
        
        
        
        return answer;
    }
}