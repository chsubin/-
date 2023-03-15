package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test009_슬라이딩윈도우 {
	static int [] arr;
	static int [] check= {0,0,0,0,0,0};
	public static void main(String[] args) throws IOException {
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bs.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int answer=0;
		
		st = new StringTokenizer(bs.readLine());
		char [] str = new char[M];
		str=  st.nextToken().toCharArray();
		
		arr = new int [4];
		st = new StringTokenizer(bs.readLine());
		for(int i=0;i<4;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<M;i++) {
			if(i<N) {
				Boolean a =Add(str[i]);
				if(i==N-1&&a) answer++;
			}
			else {
				Remove(str[i-N]);
				Boolean a = Add(str[i]);
				if(a) answer++;
			}
		}
		System.out.println(answer);
	}

	private static boolean Add(char c) {
		int cnt =0;
		if(c=='A') {check[0]++;}
		else if(c=='C') {check[1]++;}
		else if(c=='G') {check[2]++;}
		else if(c=='T') {check[3]++;}
		for(int i=0;i<4;i++) {
			if(check[i]>=arr[i]) {
				cnt++;
			}
		}
		if(cnt==4)return true;
		return false;
	}
	private static void Remove(char c) {
		if(c=='A') {check[0]--;}
		else if(c=='C') {check[1]--;}
		else if(c=='G') {check[2]--;}
		else if(c=='T') {check[3]--;}
		
	}
}
