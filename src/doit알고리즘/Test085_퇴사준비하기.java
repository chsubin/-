package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test085_퇴사준비하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int A [][] = new int[N+1][2];
		int max [] = new int [N+1];
		
		for(int i=1;i<=N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			A[i][0]= Integer.parseInt(st.nextToken()); //필요한일수
			A[i][1] = Integer.parseInt(st.nextToken()); //급여
		}
		for(int i=N;i>0;i--) {
			int day= A[i][0];
			int salary = A[i][1];
			if(day+i-1>N) {if(i==N)continue; max[i] = max[i+1];}
			else {
				if(i==N) {max[i]=salary;continue;}
				max[i]=	Math.max(max[i+1],max[i+day>N?0:i+day]+salary);
			}
		}
		System.out.println(max[1]);
	}
}
