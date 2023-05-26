import java.util.*;
class Solution {
    static int A[][];
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        A = new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(i==j) A[i][j] = 0;
                else A[i][j] = 100000001;
            }
        }
        for(int i=0;i<road.length;i++){
            int S = road[i][0];
            int E = road[i][1];
            int distance = road[i][2];
            if(A[S][E]>distance){
                A[S][E] = distance;
            }
            if(A[E][S]>distance){
                A[E][S] = distance;
            }
        }
        for(int k=1;k<=N;k++){
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    if(A[i][j]>A[i][k]+A[k][j])
                        A[i][j] =A[i][k]+A[k][j];
                }
            }
        }
        for(int i=1;i<=N;i++){
            if(A[1][i]<=K) {
                answer++;
            }
        }

        return answer;
    }
}