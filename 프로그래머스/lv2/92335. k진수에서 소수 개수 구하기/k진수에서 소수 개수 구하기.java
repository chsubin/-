class Solution {
    public int solution(int n, int k) {
		int answer =0;
		String ans = "";
		
		while(n>0) {
			ans = n%k+ans;
			n = n/k;
		}
		String [] arr = ans.split("0");
		for(String a :arr) {
			if(a.equals(""))continue;
			long su = Long.parseLong(a);
			if(su<=1) continue;
			int sw =0;
			for(int i=2;i<=Math.sqrt(su);i++) {
				if(su%i==0) {sw=1;} //약수가 있을겅우
			}
			if(sw==0)answer++;
		}
        return answer;
    }
}