package doit알고리즘;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test013_카드게임 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		for(int i=1;i<=n;i++) {
			que.add(i);
		}
		while(que.size()>1) {
			que.poll();
			que.add(que.poll());
		}
		System.out.println(que.poll());
		sc.close();
		
	}
}
