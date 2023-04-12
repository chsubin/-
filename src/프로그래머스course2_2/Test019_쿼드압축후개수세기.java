package 프로그래머스course2_2;

import java.util.LinkedList;
import java.util.Queue;

public class Test019_쿼드압축후개수세기 {
	public static void main(String[] args) {
		int [][] arr = {{1,1,1,1,1,1,1,1}
		,{0,1,1,1,1,1,1,1}
		,{0,0,0,0,1,1,1,1}
		,{0,1,0,0,1,1,1,1}
		,{0,0,0,0,0,0,1,1}
		,{0,0,0,0,0,0,0,1}
		,{0,0,0,0,1,0,0,1}
		,{0,0,0,0,1,1,1,1}};
		int n = arr.length;
		
		Queue<int[]> queue = new LinkedList<>();
		
		queue.add(new int [] {0,arr.length-1,0,arr.length-1});
		int one=0;
		int zero = 0;
		while(!queue.isEmpty()) {
			int A [] = queue.poll();
			int tile = arr[A[0]][A[2]];
			boolean flag = true;
			if(A[0]!=A[1]) {
				for(int i=A[0];i<=A[1];i++) {
					for(int j=A[2];j<=A[3];j++) {
						if(tile!=arr[i][j]) {
							flag = false;
							break;
						}
					}
				}
			}
			if(!flag) {
				queue.add(new int[] {A[0],(A[0]+A[1])/2,A[2],(A[2]+A[3])/2});
				queue.add(new int[] {(A[0]+A[1])/2+1,A[1],A[2],(A[2]+A[3])/2});
				queue.add(new int[] {A[0],(A[0]+A[1])/2,(A[2]+A[3])/2+1,A[3]});
				queue.add(new int[] {(A[0]+A[1])/2+1,A[1],(A[2]+A[3])/2+1,A[3]});
			}
			else {
				if (tile==1) {one++;}
				else {zero ++;}
				
			}
		}
		int [] answer = {zero,one};
		System.out.println(zero);
		System.out.println(one);
		
	}
}
