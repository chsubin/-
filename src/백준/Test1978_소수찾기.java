package 백준;

import java.util.*;
import java.io.*;

public class Test1978_소수찾기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int [] pro = new int [N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			pro[i] = Integer.parseInt(st.nextToken());
		}
		
		int [] A = new int [1001];
		
		for(int i=2;i<A.length;i++) {
			A[i] = i;
		}
		for(int i=2;i<=Math.sqrt(A.length);i++) { //소수만 남겼다.
			if(A[i]==0) continue;
			for(int j = i+i;j<A.length;j+=i) {
				A[j] = 0;
			}
		}
		int answer=0;
		for(int a:pro) {
			if(A[a]!=0) answer++;
		}
		System.out.println(answer);
		
	}
}
