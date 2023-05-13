import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int[] solution(int[][] arr) {
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
        return answer;
    }
}