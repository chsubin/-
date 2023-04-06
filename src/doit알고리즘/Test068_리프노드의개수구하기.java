package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test068_리프노드의개수구하기 {
	static ArrayList<Integer> A[];
	static boolean visit [];
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		A = new ArrayList[N];
		visit = new boolean [N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<A.length;i++) {
			A[i] = new ArrayList<Integer>();
		}
		int root = 0;
		for(int i=0;i<N;i++) {
			int S = Integer.parseInt(st.nextToken());
			if(S==-1) {root = i;continue;}
			A[S].add(i); //단방향
		}
		int del = Integer.parseInt(br.readLine());
		
		DFS(del);
		for(int i=0;i<N;i++) {
			for(int j=0;j<A[i].size();j++) {
				 if(visit[A[i].get(j)]) {A[i].remove(j);
				}
			}
		}
		
		int answer=0;
		for(int i=0;i<N;i++) {
			if(A[i].size()==0&&!visit[i])answer++;
		}
		if(del==root) {System.out.println(0);}
		else System.out.println(answer);
		
	}
	private static void DFS(int v) { //삭제하는메소드
		if(visit[v]) return;
		visit[v]=true;
		for(int i:A[v]) {
			if(!visit[i]){
				DFS(i);
			}
		}
		
	}
}
