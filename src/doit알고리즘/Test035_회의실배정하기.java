package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test035_회의실배정하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [][] A = new int[n][2];
		
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			A[i][0] =a;
			A[i][1] =b;
		}
		
		Arrays.sort(A, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]!=o2[1]) return o1[1]-o2[1];
				else return o1[0]-o2[0];
			}
		});
		int end =0;
		int answer=0;
		for(int i=0;i<A.length;i++) {
			int s =A[i][0];
			int e = A[i][1];
			if(s>=end) {
				answer++;
				end = e;
			}
		}
		System.out.println(answer);
	}
}
