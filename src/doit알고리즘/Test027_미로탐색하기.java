package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test027_미로탐색하기 {
	static boolean [][] visited;
	static int [][] A;
	static int min=0;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		visited = new boolean [N][M];
		A = new int [N][M];
		
		for(int i=0;i<N;i++) {
			String a = br.readLine();
			int j=0;
			for(String s:a.split("")) {
				A[i][j] = Integer.parseInt(s);
				if(A[i][j]==0) {
					visited[i][j] = true;
				}
				j++;
			}
		}
		BFS(0,0,1);
		System.out.println(A[N-1][M-1]);
		
	}
	private static void BFS(int i, int j, int k) {
		Queue<int []> queue = new LinkedList<>();
		queue.offer(new int[] {i,j});
		visited[i][j] = true;
		while(!queue.isEmpty()) {
			int a [] = queue.poll();
			int row = a[0];
			int col = a[1];
			if(row-1>=0&&!visited[row-1][col]) {
				queue.offer(new int[] {row-1,col});
				A[row-1][col] = A[row][col]+1;
				visited[row-1][col]=true;
			}
			if(col-1>=0&&!visited[row][col-1]) {
				queue.offer(new int[] {row,col-1});
				A[row][col-1]= A[row][col]+1;
				visited[row][col-1] = true;
			}
			if(row+1<A.length&&!visited[row+1][col]) {
				queue.offer(new int[] {row+1,col});
				A[row+1][col]= A[row][col]+1;
				visited[row+1][col]= true;
			}
			if(col+1<A[0].length&&!visited[row][col+1]) {
				queue.offer(new int[] {row,col+1});
				A[row][col+1]= A[row][col]+1;
				visited[row][col+1]=true;
				
			}
		}
		
		
		
		
	}
		
}
