package doit알고리즘;

import java.util.Scanner;

public class Test086_이친수구하기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long [][] A = new long [N+1][2];
		
		A[1][0] = 0;
		A[1][1] = 1;
		
		for(int i=2;i<=N;i++) {
			A[i][0] = A[i-1][0]+A[i-1][1];
			A[i][1] = A[i-1][0];
		}
		System.out.println(A[N][0]+A[N][1]);
		
		
	}
}
