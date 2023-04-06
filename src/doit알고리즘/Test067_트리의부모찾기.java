package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test067_트리의부모찾기 {
	static ArrayList<Integer> A[];
	static boolean visit[];
	static int answer[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		A = new ArrayList[N+1];
		visit = new boolean[N+1];
		answer = new int [N+1];
		
		for(int i=1;i<=N;i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=1;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			A[S].add(E);
			A[E].add(S);
		}
		answer[1] = 1;
		DFS(1);
		
		for(int i=2;i<=N;i++) {
			System.out.println(answer[i]);
		}
		
	}
	private static void DFS(int v) {
		if(visit[v]) return;
		visit[v] = true;
		for(int i :A[v]) {
			if(!visit[i]) {
				answer[i]=v;
				DFS(i);
			}
		}
		
	}
}
