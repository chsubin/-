package doit알고리즘;

import java.io.*;
import java.util.*;

public class Test032_동전개수의최솟값구하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int answer=0;
		
		int [] A = new int [N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		for(int i=N-1;i>=0;i--) {
			if(A[i]<=K) {
				answer = answer + (K/A[i]);
				K= K-(A[i]*(K/A[i]));
				if(K==0) break;
			}
		}
		System.out.println(answer);
	}
}
