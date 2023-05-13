import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
		int time =0;
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(truck_weights[0]);
		int now_weight =truck_weights[0];
		time++;
		int index=1;
		while(!queue.isEmpty()) {
			if(queue.size()==bridge_length) {//트럭이 빠져나옴
				int a =queue.poll();
				now_weight= now_weight-a;
				if(index==truck_weights.length&&queue.peek()==-1) {break;}
			}
			if(index==truck_weights.length) queue.add(-1);
			else if(now_weight+truck_weights[index]>weight) { //
				queue.add(0);
			}
			else {
				queue.add(truck_weights[index]);
				now_weight += truck_weights[index];
				index++;
			}
			time ++;
		}
		return (time+1);
    }
}