package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test054_게임개발하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> [] A = new ArrayList [N+1]; //노드배열
		int [] time = new int [N+1]; //걸리는시간배열
		int [] D = new int[N+1]; //진입차수배열

		for(int i=1;i<=N;i++) {
			A[i] = new ArrayList<Integer>();
		}
		for(int i=1;i<=N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			time[i] = Integer.parseInt(st.nextToken());
			while(st.hasMoreElements()) {
				int a = Integer.parseInt(st.nextToken());
				if(a==-1) break;
				A[a].add(i);
				D[i]++;
			}
		}
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<=N;i++) {
			if(D[i]==0) queue.add(i); 
		}
		while(!queue.isEmpty()) {
			int a = queue.poll();
			for(int v:A[a]){
				D[v]--;
				time[v]+=time[a];
				
				if(D[v]==0) {
					queue.add(v);
				}
			}
		}
		for(int i=1;i<=N;i++) {
			System.out.println(time[i]);
		}
		
	}
}
