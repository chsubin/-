package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test015_수정렬하기1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int []A = new int [n];
		for(int i=0;i<n;i++) {
			A[i] =Integer.parseInt(br.readLine());
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				int temp;
				if(A[j]>A[j+1]) {temp=A[j];A[j]=A[j+1];A[j+1]=temp;}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(A[i]);
		}
		
		
		
		
		
	}
}
