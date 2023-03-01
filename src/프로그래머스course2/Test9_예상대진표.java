package 프로그래머스course2;


public class Test9_예상대진표 {
	public static void main(String[] args) {
		int n= 8; //참가자수
		int a = 4; //a의 번호
		int b = 7; //b의 번호
		
		int answer=0;
		int cnt=0;
		boolean flag= true;
		while(flag) {
			cnt++;
			a = (a+1)/2;
			b= (b+1)/2;
			if(a==b) {
				answer= cnt;
				flag=false;
			}
			
		}
		System.out.println(answer);
		
		
		
	}
}
