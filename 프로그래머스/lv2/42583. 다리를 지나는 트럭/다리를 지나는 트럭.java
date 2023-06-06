import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int idx = 0;
        int time = 0;
        int sum = 0;
        while(true){
            time++;
            if(queue.size()<bridge_length){//다리에 다 올라가기 전
                if(idx>=truck_weights.length) queue.add(-1);
                else if(sum+truck_weights[idx]<=weight){
                    queue.add(truck_weights[idx]);
                    sum+= truck_weights[idx];
                    idx++;
                }
                else{
                    queue.add(0);
                }
            }
            if(queue.size()==bridge_length){
                int out = queue.poll();
                if(out==-1) break; //탐색 모두 끝났을떄
                sum -= out;
                if(idx>=truck_weights.length) queue.add(-1);
                else if(sum+truck_weights[idx]<=weight){
                    queue.add(truck_weights[idx]);
                    sum+= truck_weights[idx];
                    idx++;
                }
                else{
                    queue.add(0);
                }
            }
            
        }
        
        
        return time;
    }
}