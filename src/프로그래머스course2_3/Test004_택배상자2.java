package 프로그래머스course2_3;

import java.util.Stack;

public class Test004_택배상자2 {
	public static void main(String[] args) {
    //보조 컨테이너 - stack
		int [] order = {5,4,3,2,1};
    Stack<Integer> stack = new Stack<>();
    stack.add(0);
    int num = 1; //컨베이어벨트
    int i =0;
    while(i<order.length){
        int target = order[i];
        System.out.println(target);
        System.out.println(stack);
        if(stack.peek()==target){//창고 맨 앞 물건
            stack.pop();
            i++;
        }
        else if(target==num){ //컨베이어벨트와 순서가 같을때
            num++;
            i++;
        }
        else if(target!=num){ //창고에도 없고, 컨베이어벨트와도 다를때
           stack.push(num);
           num++; 
        }
        if(num==order.length+1)break;
    }
    while(i<order.length) {
    	if(stack.peek()==order[i]) {i++;stack.pop();}
    	else break;
    }
    
    
    System.out.println(i);
	}
}
