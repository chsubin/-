package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test053_줄세우기 {
	static ArrayList<Integer> A[];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		A = new ArrayList [N+1];
		int [] D = new int [N+1]; //진입차수 배열
		
		
		for(int i=1;i<N+1;i++) {
			A[i] = new ArrayList<>();
		}
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			A[S].add(E);
			D[E]++;  //진입차수배열
		}
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<=N;i++) {
			if(D[i]==0) queue.offer(i);
		}
		while(!queue.isEmpty()) {
			int a = queue.poll();
			System.out.print(a+" ");
			for(int v:A[a]) {
				D[v]--; //연결된 노드 --;
				if(D[v]==0) queue.add(v);
			}
		}
	}
}
