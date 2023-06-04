class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        int [][] cost = new int[N+1][N+1];
        int d = new int [N+1];
        boolean[] v = new boolean[N+1];
        
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                cost[i][j] = 10000001;
            }
        }
        for(int i=0;i<road.length;i++){
            int S = road[i][0];
            int E = road[i][1];
            int D = road[i][2];
            if(cost[S][E]>D){
                cost[S][E] = D;
                cost[E][S] = D;
            }
        }
        for(int i=2;i<=N;i++){
            d[i] = -1;
        }
        while(true){
            boolean check = true;
            for(int i=1;i<=N;i++){
                if(!v[i]) check = false;
            }
            if(check) break;
            int min = 10000001;
            int min_idx = -1;
            for(int i=1;i<=N;i++){
                if(d[i]>=0&&!v[i]&&min>k[i]){
                    min = d[i];
                    min_idx = i;
                }
            }
            for(int i=1;i<N;i++){
                if(i!=min_idx&&((d[min_idx]+cost[min_idx][i])||d[i] ==-1)) d[i] = d[min_idx] + cost[min_idx][i];
                v[min_idx] = true;
            }
        }
        for(int i=1;i<=N;i++){
            if(d[i]<=K)answer++;
        }
        return answer;
    }
}