package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test076_이항계수구하기1 {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int A[][]= new int [N+1][N+1];
		
		for(int i=1;i<=N;i++) {
			A[i][0] = 1;
			A[i][1]= i;
			A[i][i]= 1;
		}
		for(int i=3;i<=N;i++) {
			for(int j=2;j<i;j++) {
				A[i][j] = A[i-1][j] + A[i-1][j-1];
			}
		}
		System.out.println(A[N][K]);
		
	}
}
