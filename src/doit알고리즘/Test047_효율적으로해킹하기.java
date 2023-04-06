package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test047_효율적으로해킹하기 {
	static ArrayList<Integer> A[];
	static boolean[] visited;
	static int trust [];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		A = new ArrayList [N+1];
		trust = new int [N+1];
		
		for(int i=1;i<=N;i++) {
			A[i] = new ArrayList<Integer>();
		}
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int s1 = Integer.parseInt(st.nextToken());
			int s2 = Integer.parseInt(st.nextToken());
			
			A[s1].add(s2);
		}
		
		for(int i=1;i<N+1;i++) {
			visited = new boolean [N+1]; //거쳐서 방문하면 신뢰도++
			BFS(i);
		}
		int maxVal = 0;
		for(int i=1;i<=N;i++) {
			maxVal = Math.max(maxVal, trust[i]);
		}
		for(int i=1;i<=N;i++) {
			if(trust[i]==maxVal)
				System.out.println(i+" ");
		}
		
	}
	private static void BFS(int now) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(now);
		visited[now] = true;
		
		while(!queue.isEmpty()) {
			int new_node = queue.poll();
			for(int i:A[new_node]) {
					if(visited[i]==false) {
						visited[i] = true; //방문할때 신뢰도를 증가시켜주면됨.
						trust[i]++;
						queue.add(i);
					}
				}
				
				
			}
		}
		
		
		
		
}
