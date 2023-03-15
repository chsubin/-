package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Test10_최솟값찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bs.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int [] arr = new int [N+1];
		
		st = new StringTokenizer(bs.readLine());
		Deque<Node> mydeque = new LinkedList<>();
		for(int i=1;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int min = 109;
		for(int i=1;i<N;i++) {
			
		}
		
	}
}
