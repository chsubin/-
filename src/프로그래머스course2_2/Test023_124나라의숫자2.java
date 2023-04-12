package 프로그래머스course2_2;

public class Test023_124나라의숫자2 {
	public static void main(String[] args) {
		int n = 16;
		int A [] = {1,2,4};
		String [] answer = new String [50000001];
		
		answer[1] ="1";
		answer[2] ="2";
		answer[3] ="4";
		answer[4] ="11";
		answer[5] ="12";
		answer[6] ="14";
		answer[7] ="21";
		answer[8] ="22";
		answer[9] ="24";
		answer[10] ="41";
		answer[11] ="42";
		answer[12] ="44";
		for(int i=13;i<=n;i++) {
			String a ="";
			a += answer[(i-1)/3];
			a +=A[(i-1)%3];
			answer[i] = a;
		}
		System.out.println(answer[n]);
		
		
	}
}
