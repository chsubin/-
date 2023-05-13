class Solution {
    public String solution(int n, int t, int m, int p) {
	  String	answer="";
	  
		StringBuilder sun =new StringBuilder("0"); 
		//진법구하기
		for(int i=1;i<=t*n*m;i++) {
			int su = i;
			String result="";
			while(su >0) {
				result= (su %n>=10?String.valueOf(Character.toChars(su %n+55)):su %n)+result;
				su  = su /n;
			}
			sun.append(result);
		}
		int i=p-1;
		answer += sun.substring(i,i+1);
		while(true){
			i=i+m;
			answer += sun.substring(i,i+1);
			if(answer.length()==t) {return answer;}
		}
    }
}