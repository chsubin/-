package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test042_최소공배수구하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int [] A = new int [n];
		int [] B = new int [n];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			int a =Integer.parseInt(st.nextToken());
			int b =Integer.parseInt(st.nextToken());
			
			A[i]=a>b?a:b;
			B[i]=a>b?b:a;
		}
		for(int i=0;i<n;i++) {
			
			int a = A[i];
			int b = B[i];
			
			int na = a%b;
			int temp=b;
			
			while(na!=0) {
				temp = na;
				na = b%na;
				if(na==0)break;
				b = temp;
			}
			System.out.println((A[i]*B[i])/temp);
			
		}
		
		
		
		
	}
}
