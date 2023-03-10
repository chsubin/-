package 프로그래머스course2;

import java.util.LinkedList;
import java.util.Queue;

public class Test24_타겟넘버2넓이우선 {
	static int answer;
	static int [] numbers= {4,1,2,1};
	static int target = 4;
	public static void main(String[] args) {
		answer =0;
		BFS(numbers,target);
		
		System.out.println(answer);
	}
	private static void BFS(int [] number,int target) {
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(0,numbers[0]));
		q.add(new Pair(0,numbers[0]*-1));
		
		while(!q.isEmpty()) { //queue 안에 쌓고 인접노드들을 지워가는것
			Pair p = q.poll();
			
			if(p.position == numbers.length-1){
				if(p.sum ==target) {
					answer ++;
				}
				continue;
			}
			int nPosition = p.position +1;
			if(nPosition>=numbers.length) {
				continue;
			}
			q.add(new Pair(nPosition,p.sum+numbers[nPosition]));
			q.add(new Pair(nPosition,p.sum+numbers[nPosition]*-1));
		}
		
		
	}
	private static class Pair{
		int position;
		int sum;
		
		public Pair(int position,int sum) {
			this.position = position;
			this.sum = sum;
		}
		
		
	} 
	                                     

}
