package 프로그래머스course2_2;

public class Test014_타일링 {
	public static void main(String[] args) {
		
		int n = 4;
		
		int a = 1;
		int b = 2;
		int c = 0;
		
		for(int i=3;i<=n;i++) {
			c = (a + b)%1000000007;
			int temp;
			 a = b ;b=c ;
		}
		System.out.println(c);
		
		
		
	}
}
