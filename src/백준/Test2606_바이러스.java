package 백준;

import java.util.*;
import java.io.*;

public class Test2606_바이러스 {
	static ArrayList<Integer> A[];
	static boolean visited[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int E = Integer.parseInt(br.readLine());
		
		A = new ArrayList [N+1];
		visited = new boolean[N+1];
		
		for(int i=1;i<=N;i++) {
			A[i]= new ArrayList<Integer>();
		}
		for(int i=0;i<E;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		BFS(1);
		int answer =0;
		for(int i=1;i<=N;i++) {
			if(visited[i])answer++;
		}
		System.out.println(answer-1);
		
	}
	private static void BFS(int node) {
		if(visited[node]) return;
		visited[node]=true;
		for(int i:A[node]) {
			if(!visited[i]) {
				BFS(i);
			}
			
		}
		
	}
}
