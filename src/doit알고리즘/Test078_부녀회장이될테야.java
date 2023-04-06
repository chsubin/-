package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test078_부녀회장이될테야 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int A [][] = new int [15][15];
		
		for(int j=1;j<=14;j++) {
			A[0][j] = j;
			A[j][1] = 1;
		}
		for(int i=1;i<=14;i++) {
			for(int j=2;j<=14;j++) {
				A[i][j] = A[i][j-1] + A[i-1][j];
			}
		}
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			System.out.println(A[a][b]);
			
		}
		
	}
}
