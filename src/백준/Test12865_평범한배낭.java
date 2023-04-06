package 백준;

import java.util.*;
import java.io.*;

public class Test12865_평범한배낭 {
	static int [] W;
	static int [] V;
	static boolean visited [];
	static int value=0;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		W = new int [N];
		V = new int [N];
		visited = new boolean[N];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
		int max=0;
		for(int i=0;i<N;i++) {
			visited = new boolean[N];
			DFS(i,K,0);
			if(max<value) max = value;
			value=0;
		}
		System.out.println(max);
	}
	private static void DFS(int i,int weight,int v) { //남은중량 , 누적가치값
		weight = weight - W[i];
		if(weight<0) return;
		visited[i]= true;
		v += V[i];
		if(v>value) value = v;
		for(int j=0;j<visited.length;j++) {
			if(!visited[j]) {
				DFS(j,weight,v);
			}
			visited[i] = false;
		}
		
		
	}
}
