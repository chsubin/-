package 백준;

import java.util.*;
import java.io.*;

public class Test7568_덩치 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [][] A = new int [n][2];
		int [] rank = new int [n];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			A[i][0] = Integer.parseInt(st.nextToken());
			A[i][1] = Integer.parseInt(st.nextToken());
			
		}
		for(int i=0;i<A.length;i++) {
			rank[i]=1;
			
			for(int j=0;j<A.length;j++) {
				if(i==j) continue;
				if(A[i][0]<A[j][0]&&A[i][1]<A[j][1]) {
					rank[i]++;
				}
			}
		}
		for(int a:rank) {
			System.out.println(a);
		}
		
		
	}

}
