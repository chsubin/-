package doit알고리즘;

import java.io.*;
import java.util.*;

public class Test031_배열에서K번째수찾기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Long M = Long.parseLong(br.readLine());
		
		M--;
		int su = 0;
		for(int i=0;i<N;i++) {
			if(i*N+1<=M&&(i+1)*N>=M) {
				su = i+1; break;
			}
		}
		int row = su;
		int col =0;
		for(int i=1;i<=N;i++) {
			if((row-1)*N+i==M) {
				col = i;
				break;
			}
		}
		System.out.println(row*col);
		
		
		
		
		
	}
}
