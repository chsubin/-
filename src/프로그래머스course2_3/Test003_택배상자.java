package 프로그래머스course2_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test003_택배상자 {
	public static void main(String[] args) {
    //보조 컨테이너 - stack
		int [] order = {4,3,1,2,5};
    Stack<Integer> stack = new Stack<>();
    Queue<Integer> queue = new LinkedList<>();//보조
    
    for(int i=1;i<=order.length;i++) {
    	queue.add(i);
    }//기존
    
    int index =0;
    stack.add(0);
    while(true) {
    	if(index==order.length)break;
    	int target = order[index];
    	
    	if(stack.peek()==target) {
    		stack.pop();
    		index++;
    	}
    	else if(queue.isEmpty()) break;
    	else if(queue.peek()==target) {
    		queue.poll();
    		index++;
    	}
    	else {
    		stack.add(queue.poll());
    	}
    }
    System.out.println(index);
    
    
    
    
    
	}
}
