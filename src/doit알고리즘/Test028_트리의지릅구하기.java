package doit알고리즘;

import java.io.*;
import java.util.*;

public class Test028_트리의지릅구하기 {
	static ArrayList<Edge>[] A;
	static int [] distance;
	static boolean[] visited;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		A = new ArrayList [N+1];	
		visited = new boolean [N+1];
		distance = new int [N+1];
		for(int i=1;i<N+1;i++) {
			A[i] = new ArrayList<>();
		}
		for(int i=1;i<N+1;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a =Integer.parseInt(st.nextToken());
			while(true) {
				int j =Integer.parseInt(st.nextToken()); 
				if(j==-1)break;
				int k =Integer.parseInt(st.nextToken());
				A[a].add(new Edge(j, k));
			}
		}
		DFS(1,0);
		int max=1;
		for(int i =2;i<=N;i++) {
			if(distance[max]<distance[i]) max=i;
		}
		distance = new int [N+1];
		visited = new boolean[N+1];
		DFS(max,0);
		Arrays.sort(distance);
		System.out.println(distance[N]);
		
		for(int i:distance) {
			System.out.println(i);
		}
		
	}
	private static void DFS(int i,int k) {
		if(visited[i]) return;
		distance[i] = k;
		visited[i] = true;
		for(Edge edge : A[i]) {
			DFS(edge.e,k+edge.value);
		}
	}
}
class Edge{
	int e;
	int value;
	public Edge(int e,int value) {
		this.e = e;
		this.value = value;
	}
}
