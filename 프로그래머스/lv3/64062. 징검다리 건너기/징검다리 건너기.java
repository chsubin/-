import java.util.*;
class Solution {
    public int solution(int[] stones, int k) {
        int answer = 0;
        int min = 200000001;
        Deque<Node> queue = new LinkedList<>();
        for(int i=0;i<stones.length;i++){
            if(i<k){
                while (!queue.isEmpty()&&queue.getLast().val<=stones[i]){
                    queue.removeLast();
                }
                queue.addLast(new Node(stones[i],i));
            }
            else {
                if(queue.getFirst().index==i-k) queue.removeFirst();
                while (!queue.isEmpty()&&queue.getLast().val<=stones[i]){
                    queue.removeLast();
                }
                queue.addLast(new Node(stones[i],i));
            }
            if(i>=k-1){
                min= Math.min(queue.getFirst().val,min);
            }  
        }
        answer = min;
        
        return answer;
    }
}
class Node{
    int index;
    int val;
    Node(int val, int index){
        this.index = index;
        this.val = val;
    }
    
}