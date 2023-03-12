package 프로그래머스course2_2;

public class Test1_n진수게임2 {
	public static void main(String[] args) {
		int n  =16; 
		int t =16;
		int m = 2;
		int p = 1;
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
			if(answer.length()==t) {System.out.println(answer);break;}
		}
			
		
		
		
		
		
	}
}
