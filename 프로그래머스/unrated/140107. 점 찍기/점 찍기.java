class Solution {//상수, 거리
    public long solution(int k, int d) {
        long answer = 0;
        for(long i=0;k*i<=d;i++){
            long x = i*k;
            long y = (long)Math.sqrt((long)d*d-(long)x*x);
            answer += y/k+1;
        }
        
        
        return answer;
    }
}