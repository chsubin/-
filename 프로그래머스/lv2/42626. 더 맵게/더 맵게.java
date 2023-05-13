import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->{
            return o1-o2;
        });
        for(int i=0;i<scoville.length;i++){
            queue.add(scoville[i]);
        }
        while(!queue.isEmpty()){
            int a = queue.poll();//가장 작은수
            if(!queue.isEmpty()){
                int b = queue.poll();//두번째로작은수
                if(a>=K)break;
                answer++;
                queue.add(a+(b*2));
            }
            else if(a<K)answer = -1;
        }
        
        
        
		return answer;
	}
}