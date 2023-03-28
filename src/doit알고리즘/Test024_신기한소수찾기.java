package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test024_신기한소수찾기 {
	static int N ;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N= Integer.parseInt(br.readLine());
		
		int [] A = {2,3,5,7};
		
		for(int i =0;i<A.length;i++) {
			DFS(A[i],1);
		}
	}

	private static void DFS(int su, int count) {
		if(N==1) {
			System.out.println(su);
			return;
		}
		for(int i=1;i<=9;i++) {
			int su1 =  Integer.parseInt(su+""+i); 
			if(su1%2==0) {continue;}
			if(isPrime(su1)) {
				if(count+1==N) {
					System.out.println(su1);
					continue;
				}
				DFS(su1,count+1);
			}
		}
		
	}

	private static boolean isPrime(int su1) {
		boolean result = true;
		for(int i=2;i<=Math.sqrt(su1);i++) {
			if(su1%i==0) result= false;
		}
		return result;
	}
}
