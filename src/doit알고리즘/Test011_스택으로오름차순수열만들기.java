package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test011_스택으로오름차순수열만들기 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer bf = new StringBuffer();
		boolean result = true;
		
		int N =  Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		int j=1;
		int [] A = new int [N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			A[i] =Integer.parseInt(st.nextToken()) ;
		}
		
		for(int M:A) {
			if(!stack.isEmpty()) {
				if(M==stack.peek()) {
					stack.pop();
					bf.append("-\n");
					continue;
				}
				if(M<stack.peek()) {
					System.out.println("NO");
					result = false;
					break;
				}
			}
			while(j<=M) {
				stack.push(j);
				bf.append("+\n");
				j++;
			}
			if(!stack.isEmpty()) {
				stack.pop();
				bf.append("-\n");
			}
		}
		while(!stack.isEmpty()) {
			stack.pop();
			bf.append("-\n");
		}
		if(result) System.out.println(bf.toString());
		
		
	}
}
