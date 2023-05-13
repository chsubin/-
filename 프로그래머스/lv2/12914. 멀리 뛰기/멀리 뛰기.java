class Solution {
    public long solution(int n) {
		long answer =0;
		
		int FN1 = 1;
		int FN2 = 2;
		int su =0;
		if(n==1) {answer=1%1234567;return answer;}
		if(n==2) {answer=2%1234567;return answer;}
		for(int i=3;i<=n;i++) {
			su = (FN1+FN2)%1234567 ;
			FN1 = FN2; FN2 = su;
			answer = su;
		}
        return answer;
    }
}