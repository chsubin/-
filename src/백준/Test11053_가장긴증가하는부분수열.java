package 백준;

import java.util.*;
import java.io.*;

public class Test11053_가장긴증가하는부분수열 {
	static int A[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		A = new int [n][2];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			A[i][0] = Integer.parseInt(st.nextToken());
			A[i][1] = 1;
		}
		int real_Max=0;
		for(int i=1;i<n;i++) {
			int max =0;
			for(int j=0;j<i;j++) {
				if(A[j][0]<A[i][0]) max = Math.max(max, A[j][1]);
			}
			A[i][1] =max+A[i][1];
			real_Max = Math.max(A[i][1],real_Max);
		}
		if(n==1)System.out.println(1);
		else System.out.println(real_Max);
	}
}
