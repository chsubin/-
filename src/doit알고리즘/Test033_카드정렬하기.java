package doit알고리즘;

import java.io.*;
import java.util.*;


public class Test033_카드정렬하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for(int i=0;i<n;i++) {
			queue.add(Integer.parseInt(br.readLine()));
		}
		int sum =0;
		while(!queue.isEmpty()) {
			int a =queue.poll();
			if(queue.isEmpty()) {break;}
			int b = queue.poll();
			sum += a+b;
			queue.add(a+b);
			if(queue.size()==1) break;
		}
		System.out.println(sum);
		
		
		
		
	}
}
