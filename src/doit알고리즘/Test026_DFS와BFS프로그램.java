package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test026_DFS와BFS프로그램 {
	static ArrayList<Integer> [] A;
	static boolean [] visited;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		A = new ArrayList [N+1];
		visited = new boolean [N+1];
		
		for(int i =1;i<N+1;i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()); 
			int e = Integer.parseInt(st.nextToken()); 
			A[s].add(e);
			A[e].add(s);
		}
		for(int i=1;i<N+1;i++) {
			Collections.sort(A[i]);
		}
		DFS(start);

		visited = new boolean [N+1];
		System.out.println();
		BFS(start);
		
		
		
		
	}
	private static void BFS(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int a = queue.poll();
			System.out.print(a+" ");
			for(int i:A[a]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
	private static void DFS(int v) {
		if(visited[v]) return;
		visited[v] = true;
		System.out.print(v+" ");
		for(int i:A[v]) {
			DFS(i);
		}
		
	}

}
