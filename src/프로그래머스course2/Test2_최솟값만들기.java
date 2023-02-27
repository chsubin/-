package 프로그래머스course2;

import java.util.Arrays;

public class Test2_최솟값만들기 {
	public static void main(String[] args) {
		int [] A = {1,2};
		int [] B = {3,4};
		int answer =0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int sum=0;
		for(int i=0;i<A.length;i++) {
			sum+=A[i]*B[B.length-1-i];
		}
		
		answer = sum;
		
		
		System.out.println(answer);
	}
}
