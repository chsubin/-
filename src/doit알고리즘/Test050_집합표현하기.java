package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test050_집합표현하기 {
	static int []A;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int qu = Integer.parseInt(st.nextToken());
		
		A = new int [n+1];
		
		for(int i=1;i<n+1;i++) {
			A[i] = i; //초기화완료
		}
		
		for(int i=0;i<qu;i++) {
			st = new StringTokenizer(br.readLine());
			
			int a1 = Integer.parseInt(st.nextToken());
			int a2 = Integer.parseInt(st.nextToken());
			int a3 = Integer.parseInt(st.nextToken());
			
			if(a1==0) {
				union(a2,a3);
				
			}
			else {
				if(checksame(a2,a3)) System.out.println("YES");
				else System.out.println("NO");
			}
			
			
		}
		
		
	}

	private static boolean checksame(int a2, int a3) {
		if (find(a2)==find(a3)) return true;
		else 	return false;
	}

	private static void union(int a, int b) { //두수를 합쳐야 한다.
		//두수의 대표노드를 찾아 연결
		if(find(a)!=find(b)) {
			A[find(b)]=find(a); //두 대표노드를 연결
		}
	}

	private static int find(int a) {
		if(A[a]==a) return a;
		else {
			return A[a] = find(A[a]); //자기자신의 대표노드를 찾아 자기자신을 대표노드로 초기화(경로압축 로직)
		}
	}

	
	
	
	
	
}
