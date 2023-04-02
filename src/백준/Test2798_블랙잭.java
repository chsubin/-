package 백준;

import java.util.*;
import java.io.*;

public class Test2798_블랙잭 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int [] A = new int [N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		int max=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					if(i==k||j==k||j==i)continue;
					int su = A[i]+A[j]+A[k];
					if(su<=M&&max<su) {
						max= su;
					}
				}
			}
		}
		System.out.println(max);
		
		
	}

	
}
