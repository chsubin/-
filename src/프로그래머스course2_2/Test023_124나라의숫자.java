package 프로그래머스course2_2;

public class Test023_124나라의숫자 {
	static int A [] = {1,2,4};
	public static void main(String[] args) {
		int n = 1;

		System.out.println(FIND(n).toString());
		
	}
	private static StringBuilder FIND(int n) {
		int a = (n-1)/3-1;
		int b = (n-1)%3;
		StringBuilder sb = new StringBuilder(); 
		if(a<0) {
			sb.append(A[b]);
		}
		else if (a<3){
			sb.append(A[a]);
			sb.append(A[b]);
		}
		else {
			sb.append(FIND(a+1));
			sb.append(A[b]);
		}
		return  sb;
	}
}
