package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test084_정수를1로만들기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int [] A = new int [N+1];
		
		for(int i=2;i<N+1;i++) {
			int su = 99999999;
			if(i%3==0)su = A[i/3];
			if(i%2==0&&su>A[i/2]) su = A[i/2];
			if(A[i-1]<su) su = A[i-1];
			A[i] = su+1;
		}		
		System.out.println(A[N]);
		for(int i=0;i<A.length;i++) {
			System.out.println(i+" : "+A[i]);
		}
		
		
	}
}
