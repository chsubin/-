import java.util.*;
class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        int [][] distance  = new int [n+1][n+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                distance[i][j]  = 10000001; //distance초기화하기
            } 
        }
        for(int i=0;i<results.length;i++){
            int s = results[i][0];
            int e = results[i][1];
            distance[s][e] = 1;
        }
        for(int k=1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(distance[i][j]>distance[i][k]+distance[k][j]) 
                        distance[i][j] = distance[i][k]+distance[k][j];
                }
            }
        }
        for(int k=1;k<=n;k++){
            int su = 0;
            for(int i=1;i<=n;i++){
                if(distance[k][i]!=10000001){
                    su++;
                }
            }
            for(int j=1;j<=n;j++){
                if(distance[j][k]!=10000001){
                    su++;
                }
            }
            if(su>=n-1) answer++;
        }
        
        
        return answer;
    }
}