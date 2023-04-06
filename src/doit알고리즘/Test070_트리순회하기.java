package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test070_트리순회하기 {
	static int A[][];
	static boolean visit[];
	static String str="";
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		A = new int[26][2];
		visit = new boolean[N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char pa = st.nextToken().charAt(0);
			char l = st.nextToken().charAt(0);
			char r = st.nextToken().charAt(0);
			A[pa-'A'][0]= l!='.'?l-'A':-1;//왼쪽
			A[pa-'A'][1]= r!='.'?r-'A':-1;//오른쪽
		}
		FRONT(0);
		System.out.println(str);
		visit = new boolean[N];
		str="";
		MID(0);
		System.out.println(str);
		visit = new boolean[N];
		str="";
		BACK(0);
		System.out.println(str);
		
		
	}
	private static void FRONT(int i) {
		visit[i]= true;
		str+=(char)(i+'A');
		if(A[i][0]!=-1) {
			if(!visit[A[i][0]]) {
			FRONT(A[i][0]);
			}
		}
		if(A[i][1]!=-1) {
			if(!visit[A[i][1]]) {
			FRONT(A[i][1]);
			}
		}
	}
	private static void MID(int i) {
		if(A[i][0]!=-1) {
			if(!visit[A[i][0]]) {
				MID(A[i][0]);
			}
		}
		if(!visit[i]) {
			visit[i]= true;
			str+=(char)(i+'A');
			MID(i);
		}
		
		if(A[i][1]!=-1) {
			if(!visit[A[i][1]]) {
				MID(A[i][1]);
			}
		}
	}
	private static void BACK(int i) {
		if(A[i][0]!=-1) {
			if(!visit[A[i][0]]) {
				BACK(A[i][0]);
			}
		}
		if(A[i][1]!=-1) {
			if(!visit[A[i][1]]) {
				BACK(A[i][1]);
			}
		}
		str+=(char)(i+'A');
		visit[i]= true;
	}
}
