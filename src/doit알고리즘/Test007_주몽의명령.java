package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test007_주몽의명령 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bs = new BufferedReader(new  InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bs.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bs.readLine());
		int N = Integer.parseInt(st.nextToken());
		int [] arr = new int [M];
		st = new StringTokenizer(bs.readLine());
		for(int i=0;i<M;i++) {
			arr[i] = Integer.parseInt(st.nextToken()) ;
		}
		Arrays.sort(arr);
		long answer = 0;
		int i=0;
		int j=M-1;
		
		while(i!=j) {
			if(arr[i]+arr[j]>=N) {
				if(arr[i]+arr[j]==N) answer++;
				j--;
			}
			else {
				i++;
			}
			
		}
		System.out.println(answer);
		
	}
}
