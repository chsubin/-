package doit알고리즘;

import java.io.*;
import java.util.*;

public class Test080_조약돌꺼내기2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long A [][] = new long [2501][2501];
		
		for(int i=1;i<2501;i++) {
			A[i][0] = 1;
			A[i][i] = 1;
			A[i][1] = i;
		}
		for(int i=3;i<2501;i++) {
			for(int j=2;j<i;j++) {
				A[i][j]=A[i-1][j]+A[i-1][j-1];
			}
		}
		int n = Integer.parseInt(br.readLine());
		int stone [] = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum=0;
		for(int i =0;i<n;i++) {
			stone[i] = Integer.parseInt(st.nextToken());
			sum+= stone[i];
		}
		int K = Integer.parseInt(br.readLine());
		int bunsu=0;
		for(int a:stone) {
			bunsu += A[a][K];
		}
		System.out.println((double)bunsu/A[sum][K]);
		
		
		
	}
}
