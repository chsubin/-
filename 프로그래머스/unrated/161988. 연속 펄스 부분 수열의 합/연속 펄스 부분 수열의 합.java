class Solution {
    public long solution(int[] sequence) {
        long answer = 0;
        
        long [] minus = new long [sequence.length];
        long [] plus = new long [sequence.length];
        
        int M = 1;
        int P = -1;
        
        for(int i=0;i<sequence.length;i++){
            M *= -1;
            P *= -1;
            minus[i] = sequence[i]*M;
            plus[i] = sequence[i]*P;
        }
        long [] minus_hap = new long [sequence.length];
        long [] plus_hap = new long [sequence.length];
        minus_hap[0] = minus[0];
        plus_hap[0] = plus[0];
        for(int i=1;i<sequence.length;i++){
            minus_hap[i] = minus_hap[i-1]+minus[i];
            plus_hap[i] = plus_hap[i-1] + plus[i]; //구간합 구하기
        }
        long plus_min = 0;
        long minus_min = 0;
        long maxp = -10000001;
        long maxm = -10000001;
        for(int i=0;i<sequence.length;i++){
            minus[i] = minus_hap[i] - minus_min;
            plus[i] = plus_hap[i] - plus_min;
            plus_min = Math.min(plus_min,plus_hap[i]);
            minus_min = Math.min(minus_min,minus_hap[i]);
            maxp = Math.max(maxp,plus[i]);
            maxm = Math.max(maxm,minus[i]);
        }
        answer = Math.max(maxp,maxm);
        
        
        
        return answer;
    }
}