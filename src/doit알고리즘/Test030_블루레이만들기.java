package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test030_블루레이만들기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int [] arr = new int [N];
		st = new StringTokenizer(br.readLine());
		int max = 0;
		int sum = 0;
		for(int i=0;i<N;i++) {
			arr[i]= Integer.parseInt(st.nextToken());
			if(arr[i]>max) max = arr[i];
			sum+= arr[i];
		}
		int min = 100000;
		int start = max;
		int end = sum;
		while(start<=end) { //이진트리 실행
			int middle = (start+end)/2; //블루레이의 크기
			int count =0;
			sum =0;
			
			for(int i=0;i<N;i++) {
				if(sum+arr[i]>middle) {
					count++;
					sum =0;
				}
				sum+= arr[i];
			}
			if(sum!=0) {
				count++;
			}
			if(count<=M) {
				end = middle -1;
			}//가능
			else {start = middle+1;} //불가능
		}
		System.out.println(start);
	}
}
