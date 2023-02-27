package 프로그래머스;

import java.util.Arrays;

public class Test7_예산 {
	public static void main(String[] args) {
		int [] d = {1,3,2,5,4};
		int budget = 9;
		int answer = 0;
		
		Arrays.sort(d);
		for(int i=0;i<d.length;i++) {
			budget-=d[i];
			if(budget<0) break;
			answer=i+1;
		}
		
		System.out.println(answer);
	}
}
