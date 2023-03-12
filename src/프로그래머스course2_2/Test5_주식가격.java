package 프로그래머스course2_2;

public class Test5_주식가격 {
	public static void main(String[] args) {
		int [] prices = {1,2,3,2,3};
		
		int [] answer = new int [prices.length];
		
		for(int i=0;i<prices.length;i++) {
			for(int j=i;j<prices.length-1;j++) {
				if(prices[i]<=prices[j])answer[i]++;
				else break;
			}
		}
		for(int a : answer) {
			System.out.println(a);
		}
		
		
		
	}
}
