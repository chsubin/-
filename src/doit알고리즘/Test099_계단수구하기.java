package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test099_계단수구하기 {
	static long mod = 1000000000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long [][] A = new long [N+1][10];
		
		for(int i=1;i<10;i++) {
			A[1][i] = 1;
		}

		for(int i=2;i<=N;i++) {
			A[i][0] = A[i-1][1];
			A[i][9] = A[i-1][8];
			for(int j=1;j<9;j++) {
				A[i][j] =(A[i-1][j-1]+A[i-1][j+1])%mod;
			}
		}
		long sum =0;
		for(int i=0;i<10;i++) {
			sum = (sum+A[N][i])%mod;
		}
		System.out.println(sum);
		
	}
}
