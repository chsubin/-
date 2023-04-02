package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test044_칵테일만들기 {
	static ArrayList<Node> A[];
	static long GDC = 1;
	static boolean visited[];
	static long B[];

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;

		A = new ArrayList[n];
		visited = new boolean[n];
		B = new long[n];

		for (int i = 0; i < n; i++) {
			A[i] = new ArrayList<>();
		}

		for (int i = 0; i < n - 1; i++) { // 상관관계도 파악
			st = new StringTokenizer(br.readLine());
			int su1 = Integer.parseInt(st.nextToken());
			int su2 = Integer.parseInt(st.nextToken());
			int su3 = Integer.parseInt(st.nextToken());
			int su4 = Integer.parseInt(st.nextToken());

			A[su1].add(new Node(su2, su3, su4));
			A[su2].add(new Node(su1, su4, su3));

			GDC *= (su3 * su4 / gdc(su3, su4));
		} // 최소공배수 구하기 완료
		B[0] = GDC;
		DFS(0);
		
		 long mgcd = B[0]; //비율에 맞는 것 구했으니 최대공약수로 나누어주어야함. 
		 for(int i=1;i<n;i++) {
		  mgcd= gdc(mgcd,B[i]); }
	 
		 for(long b:B) { System.out.print(b/mgcd+" "); }
		 
	}

	private static void DFS(int i) {
		visited[i] = true;
		for (Node v : A[i]) {
			int next = v.getB();
			if (!visited[v.getB()]) {
				B[next] = B[i] * v.getQ() / v.getP();
				DFS(next);
			}
		}
	}

	private static long gdc(long l, long m) { // 최소공배수구하기
		long i = l > m ? l : m;
		long j = l > m ? m : l;
		if (j == 0)
			return i;

		long na = i % j;
		if (na == 0) {
			return j;
		}
		return gdc(j, na);
	}
}

class Node {
	int b;
	int p;
	int q;

	public Node(int b, int p, int q) {
		super();
		this.b = b;
		this.p = p;
		this.q = q;

	}

	public int getB() {
		return this.b;
	}

	public int getP() {
		return this.p;
	}

	public int getQ() {
		return this.q;
	}

}
