import java.util.*;
class Solution {
    static boolean visit [];
    static ArrayList<Integer> A[];
    static int max=0;
    public int solution(int n, int[][] wires) {
        int answer = 100;
        for(int k=0;k<wires.length;k++){
            A = new ArrayList [n+1];
            for(int i=1;i<=n;i++){
                A[i] = new ArrayList<Integer>();
            }
            for(int i=0;i<wires.length;i++){
                if(i!=k){
                    A[wires[i][0]].add(wires[i][1]);
                    A[wires[i][1]].add(wires[i][0]);
                }
            }

            visit = new boolean [n+1]; //전선이 끊어진것을 표현
            for(int j=1;j<A.length;j++){
                DFS(j,1);
                if(max ==0){
                    for(int i=1;i<visit.length;i++){
                        if(visit[i])max++;
                    }
                    
                }
            }
            int ab = Math.abs(max-(n-max));//절대값 차이 구하기
            answer = Math.min(answer,ab); //절대값 차이가 작은것고르기
            max =0;
            
        }
       
        
        return answer;
    }
    public static void DFS(int now , int depth){
        if(visit[now]) return;
        visit[now] = true;
        for(int i:A[now]){
            if(!visit[i]){
                DFS(i,depth+1);
            }
        }
        
    }
}