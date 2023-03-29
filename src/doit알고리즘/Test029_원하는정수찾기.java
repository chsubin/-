package doit알고리즘;

import java.io.*;
import java.util.*;

public class Test029_원하는정수찾기 {
	static int [] arr;
	public static void main(String[] args) throws IOException,NumberFormatException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		arr = new int [N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		int [] answer = new int [M];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			answer[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for(int a:answer) {
			TreeSearch(a);
		}
		
	}

	private static void TreeSearch(int a) {
		int start =0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (end+start)/2;
			if(arr[mid]>a) {
				end = mid-1;
			}
			else if(arr[mid]<a) {
				start = mid+1;
			}
			else {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}
}
