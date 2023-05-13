import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> queue1 = new PriorityQueue<>(); //오름차순
        PriorityQueue<Integer> queue2 = new PriorityQueue<>((o1,o2)->{return o2-o1;}); //내림차순
        for(int i=0;i<operations.length;i++){
            String [] strs = operations[i].split(" ");
            if(strs[0].equals("I")){
                queue1.add(Integer.parseInt(strs[1]));
                queue2.add(Integer.parseInt(strs[1]));
            }
            else{
                if(!queue1.isEmpty()){
                    if(strs[1].equals("-1")){
                        int a = queue1.poll();
                        queue2.remove(a);
                    }
                    else{
                        int a = queue2.poll();
                        queue1.remove(a);
                    }
                }
            }
        }
        if(!queue1.isEmpty()){
            answer[1] = queue1.poll();
            answer[0] = queue2.poll();
        }
        
        return answer;
    }
}