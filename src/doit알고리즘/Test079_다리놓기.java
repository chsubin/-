package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test079_다리놓기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		long A[][] = new long [30][30];
		
		for(int i=1;i<30;i++) {
			A[i][0] = 1;
			A[i][1] = i;
			A[i][i] = 1;
		}
		for(int i=3;i<30;i++) {
			for(int j=2;j<i;j++) {
				A[i][j] = (long)A[i-1][j] + (long)A[i-1][j-1];
			}
		}
		
		for(int i=0;i<K;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			System.out.println(A[M][N]);
			
		}
		
		
	}
}
