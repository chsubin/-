package 백준;

import java.util.*;
import java.io.*;

public class Test2630_색종이만들기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [][] A = new int [n][n];
		Queue<int[]> queue = new LinkedList<>();
		int B [];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++) {
				A[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		queue.add(new int []{0,n-1,0,n-1});
		int blue= 0;
		int white= 0;
		while(!queue.isEmpty()) {
			B = queue.poll();
			int s = A[B[0]][B[2]];
			int sw = 0;
		  for(int i=B[0];i<=B[1];i++){
		  	for(int j=B[2];j<=B[3];j++) {
		  		if(A[i][j]!=s) {
		  			queue.add(new int[] {B[0],(B[0]+B[1])/2,B[2],(B[2]+B[3])/2});
		  			queue.add(new int[] {B[0],(B[0]+B[1])/2,(B[2]+B[3])/2+1,B[3]});
		  			queue.add(new int[] {(B[0]+B[1])/2+1,B[1],B[2],(B[2]+B[3])/2});
		  			queue.add(new int[] {(B[0]+B[1])/2+1,B[1],(B[2]+B[3])/2+1,B[3]});
		  			sw =1;
		  			break;
		  		}
		  	}
		  	if (sw ==1) break;
		  }
			if(sw==0) { 
				if(s ==1) blue++;;
				if(s ==0) white++;
			}
			
		}
		
		System.out.println(white);
		System.out.println(blue);
	}
}
