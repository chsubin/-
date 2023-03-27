package doit알고리즘;

import java.io.IOException;
import java.util.Scanner;

public class Test018_ATM인출계산하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int [] A = new int [N];
		int [] S = new int [N];
		
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=1;i<N;i++) {
			int j = i-1;
			while(j>=0) {
				if(A[j]<=A[j+1]) break;
				else {int temp = A[j];A[j]=A[j+1];A[j+1]=temp;}
				j--;
			}
		}
		int sum=0;
		int answer =0;
		for(int i=0;i<N;i++) {
			sum+=A[i];
			S[i]= sum;
			answer+=S[i];
		}
		System.out.println(answer);
	}
}
