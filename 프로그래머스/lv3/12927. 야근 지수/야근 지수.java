import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<works.length;i++){
            queue.add(works[i]);
        }
        for(int i=0;i<n;i++){
            int a  =queue.poll();
            a--;
            if(a<0) a = 0;
            queue.add(a);
        }
        while(!queue.isEmpty()){
            int a  = queue.poll();
            answer+=a*a;
        }
        
        return answer;
    }
}