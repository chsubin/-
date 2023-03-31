package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test038_거의소수구하기 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long m = Long.parseLong(st.nextToken());
		long n = Long.parseLong(st.nextToken());
		
		long [] A = new long [10000001];
		
		for(int i=2;i<A.length;i++) {
			A[i] = i;
		}		
		for(int i=2;i<=Math.sqrt(A.length);i++) { //소수구하기
			if(A[i]==0)continue;
			for(int j =i+i;j<A.length;j+=i) {
				A[j]=0;
			}
		}
		int answer=0;
		for(int i = 2;i<10000001;i++) {
			long a = A[i];
			if(a==0)continue;
			long su = a;
			while((double)a<=(double)n/(double)su) { //1제곱,2제곱,3제곱...을 실행한다.
				if((double)a>=(double)m/(double)su) {
					answer++;
				}
				su = su*a;
			}
		}
		System.out.println(answer);
		
		
	}
}
