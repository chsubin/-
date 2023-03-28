package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test025_친구관계파악하기 {
	static ArrayList<Integer> [] A;
	static boolean [] visited;
	static int answer=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		A = new ArrayList[N]; 
		visited = new boolean[N];
		
		for(int i=0;i<N;i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		for(int i=0;i<N;i++) {
			DFS(i,1);
			visited = new boolean[N];
			if(answer==1)break;
		}
		System.out.println(answer);
		
	}
	private static void DFS(int v, int depth) {
		if(answer==1) return;
		if(depth==5) {answer=1;return;}
		visited[v] = true;
		for(int i: A[v]) {
			if(!visited[i])DFS(i,depth+1);
		}
		visited[v]=false;
		
		
	}
}
