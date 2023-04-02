package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test046_특정거리의도시찾기2 {
	static ArrayList<Integer> A[];
	static int visited[];
	static int K ;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());//타겟
		int X = Integer.parseInt(st.nextToken());//출발
		
		A = new ArrayList [N+1];
		visited = new int [N+1];
		
		for(int i=1;i<=N;i++) {
			A[i]=new ArrayList<>();
			visited[i] = -1;
		}
		for(int i=0;i<M;i++) {
			st =  new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			A[a].add(b);
		}
		BFS(X,0);
		
		int sw=0;
		for(int i=1;i<=N;i++) {
			if(visited[i]==K) {
				bw.write(i+"\n");
				sw=1;
			}
		}
		if(sw==0) {
			bw.write("-1");
		}
		bw.flush();
		bw.close();
			
	}
	private static void BFS(int node, int distance) {
		Queue<Integer> que = new LinkedList<>();
		que.add(node);
		visited[node]++;
		while(!que.isEmpty()) {
			int a =que.poll();
			for(int i:A[a]) {
				if(visited[i]==-1) {
					visited[i]=visited[a]+1;
					que.add(i);
				}
			}
			
			
		}
		
	}


}
