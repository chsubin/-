import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        for(int i=0;i<cards2.length;i++){
            queue2.add(cards2[i]);
        }
        for(int i=0;i<cards1.length;i++){
            queue1.add(cards1[i]);
        }
        
        for(int i=0;i<goal.length;i++){
            String str = goal[i];
            boolean flag = false;
            if(!queue1.isEmpty()) if(queue1.peek().equals(str)) {queue1.poll();flag = true;}
            if(!queue2.isEmpty()) if(queue2.peek().equals(str)) {queue2.poll(); flag = true;}
             
            if(!flag) answer = "No";
        }
        
        
        return answer;
    }
}