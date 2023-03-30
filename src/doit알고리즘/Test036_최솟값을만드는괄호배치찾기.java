package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test036_최솟값을만드는괄호배치찾기 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		Queue<Integer> que = new LinkedList<>();
		
		int plus =0;
		String temp ="";
		for(String a : str.split("-")) {
			for(int i=0;i<a.length();i++) {
				String st = a.substring(i, i+1);
				if(st.equals("+")) {
					plus += Integer.parseInt(temp);
					temp = "";
				}
				else {
					temp+=st;
				}
			}
			plus += Integer.parseInt(temp);
			temp ="";
			que.add(plus);
			plus =0;
		}
		
		int answer = que.poll();
		while(!que.isEmpty()) {
			answer-=que.poll();
		}
		System.out.println(answer);
	}
}
