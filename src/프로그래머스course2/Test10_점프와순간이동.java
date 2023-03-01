package 프로그래머스course2;

public class Test10_점프와순간이동 {
	public static void main(String[] args) {
		
		int n = 5;
		int ans =0;
		
		while(n>0) {
			ans += n%2;
			n = n/2;
		}
		System.out.println(ans);
		
		
	}
}
