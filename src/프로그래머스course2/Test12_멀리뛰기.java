package 프로그래머스course2;
//피보나치 수열
public class Test12_멀리뛰기 {
	public static void main(String[] args) {
		int n = 6;
		long answer =0;
		
		int FN1 = 1;
		int FN2 = 2;
		//F1 = 1;F1=2;F3=(1+2);F4 = F1+F2+F3 1+2+(1+2); F5 = 1+2+(1+2)+(1+2+1+2);
		if(n==1) System.out.println(1/1234567);
		if(n==2) System.out.println(2/1234567);
		for(int i=3;i<=n;i++) {
			 //n번째 피보나치 수
			answer  = (FN1+FN2)%1234567 ;
			FN1 = FN2; FN2 = (int)answer;
		}
		
		
		System.out.println(answer/1234567);
	}
}
