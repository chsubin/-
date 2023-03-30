package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Test034_수를묶어서최댓값만들기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queuep = new PriorityQueue<>((i,j)->{return j-i;});
		PriorityQueue<Integer> queuem = new PriorityQueue<>();
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(br.readLine());
			if(a<=0) queuem.add(a);
			else queuep.add(a);
		}
		int sum=0;
		while(!queuem.isEmpty()) {
			if(queuem.size()!=1) {
				int a = queuem.poll();
				int b = queuem.poll();
				sum += a*b;
			}
			else {
				int a = queuem.poll();
				sum +=a;
			}
		}
		
		while(!queuep.isEmpty()) {
			int a = queuep.poll();
			if(queuep.isEmpty()) {sum+=a;break;}
			int b = queuep.poll();
			if(a==1||b==1) {
				sum+=a;
				sum+=b;
				continue;
			}
			sum += a*b;
		}		
		
		System.out.println(sum);
		
	}
}
