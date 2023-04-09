package 프로그래머스course2_2;

import java.util.LinkedList;
import java.util.Queue;

public class Test015_다리를지나는트럭 {
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int [] truck_weight = {7,4,5,6};
		int time =0;
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(truck_weight[0]);
		int now_weight =truck_weight[0];
		time++;
		int index=1;
		while(!queue.isEmpty()) {
			if(queue.size()==bridge_length) {//트럭이 빠져나옴
				int a =queue.poll();
				now_weight= now_weight-a;
				if(index==truck_weight.length&&queue.peek()==-1) {break;}
			}
			if(index==truck_weight.length) queue.add(-1);
			else if(now_weight+truck_weight[index]>weight) { //
				queue.add(0);
			}
			else {
				queue.add(truck_weight[index]);
				now_weight += truck_weight[index];
				index++;
			}
			time ++;
		}
		System.out.println(time+1);
	}
}
