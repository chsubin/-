package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test046_특정거리의도시찾기 {
	static ArrayList<Integer> A[];
	static boolean visited[];
	static int [] B;
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
		visited = new boolean [N+1];
		B = new int [N+1];
		
		for(int i=1;i<=N;i++) {
			A[i]=new ArrayList<>();
		}
		for(int i=0;i<M;i++) {
			st =  new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			A[a].add(b);
		}
		DFS(X,0);
		
		int sw=0;
		for(int i=1;i<=N;i++) {
			if(B[i]==K&&i!=X) {
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
	private static void DFS(int node, int distance) {
		if(visited[node]) return;
		if(distance==K) {
			if(B[node]==0||B[node]>=K)B[node]=K;
			return;
		}
		visited[node]= true;
		B[node]= distance;
		
		for(int i:A[node]) {
			if(!visited[i]) {
				DFS(i,distance+1);
			}
			visited[node]= false;
		}
	}


}
