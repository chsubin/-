package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Test014_절댓값힙구현하기 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) ;
		
		PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2)->{
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			
			if(first_abs == second_abs) return o1-o2;
			else return first_abs-second_abs; //우선순위 정의
		});
		for(int i=0;i<n;i++) {
			int request = Integer.parseInt(br.readLine());
			if(request==0) {
				if(myQueue.isEmpty())System.out.println("0");
				else System.out.println(myQueue.poll());
			}
			else {
				myQueue.add(request);
			}
			
		}
		
		
	}
}
