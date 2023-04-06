package 백준;

import java.util.*;
import java.io.*;

public class Test13263_나무자르기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [] A = new int [n+1];
		int [] B = new int [n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		for(int i=1;i<=n;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
	
		int charge = B[1]; //현재 1당 충전비용
		int sum =0; //누적충전비용
		int pre = charge*A[n]; //예상비용
		System.out.println(pre);
		for(int i=2;i<A.length;i++) {
			System.out.println(sum+charge*A[i]+B[i]*A[n]);
			if(sum+charge*A[i]+B[i]*A[n]<pre) {
				pre = sum+charge*A[i]+B[i]*A[n];
				System.out.println(pre);
				sum+= charge*A[i];
				charge = B[i];
			}
		}
		System.out.println(pre);
		
		
		
		
	}
}
