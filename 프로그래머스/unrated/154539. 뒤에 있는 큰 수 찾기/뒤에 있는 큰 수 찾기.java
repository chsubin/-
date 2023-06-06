import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Node> stack = new Stack<>();
        for(int i=0;i<numbers.length;i++){
            int number = numbers[i];
            while(!stack.isEmpty()){
                Node node = stack.peek();
                if(node.su<number){
                    answer[node.index] = number;
                    stack.pop();
                }
                else break;
            }
            stack.add(new Node(i,number));
        }
        while(!stack.isEmpty()){
            Node node = stack.pop();
            answer[node.index] = -1;
        }
        return answer;
    }
}
class Node{
    int index;
    int su;
    Node(int index, int su){
        this.index = index;
        this.su = su;
    }
}