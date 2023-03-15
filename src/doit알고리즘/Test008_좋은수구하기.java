package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test008_좋은수구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bs.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int [] arr = new int [M];
		st = new StringTokenizer(bs.readLine());
		for(int i=0;i<M;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int answer=0;
		
		for(int i=0;i<M;i++) {
			int j= i==0?1:0;
			int k= i==M-1?M-2:M-1;
			while(j!=k) {
				if(arr[j]+arr[k]<arr[i]) {
					j = j+1 ==i?j+2:j+1;
				}
				else {
					if(arr[j]+arr[k]==arr[i]) {answer ++;break;}
					k = k-1==i?k-2:k-1;
				}
			}
		}
		System.out.println(answer);
		
	}
}
