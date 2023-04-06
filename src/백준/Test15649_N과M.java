package 백준;

import java.util.*;
import java.io.*;

public class Test15649_N과M {
	static int [] A;
	static boolean [] visited;
	static int M;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		
		A = new int [N];
		visited = new boolean[N];
	
		for(int i=0;i<N;i++) {
			A[i] = i+1;
		}
		for(int i=0;i<N;i++) {
			DFS(i,1,"");
		}
		
	}
	private static void DFS(int now,int K,String str) {
		if(visited[now]) return;
		visited[now]= true;
		str += A[now]+" ";
		if(K==M) System.out.println(str);
		for(int i=0;i<A.length;i++) {
			DFS(i,K+1,str);
		}
		visited[now] = false;
	}
}
