import java.util.*;
class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((o1,o2)->{
            return o2-o1; //내림차순으로 우선순위 큐 정렬
        });
        int sum = 0;
        for(int i=0;i<enemy.length;i++){
            queue.add(enemy[i]);
            sum += enemy[i];
            if(sum>n){
                while(k>0){
                    int a = queue.poll();
                    sum -= a;
                    k--;
                    if(sum<=n) break;
                }
                if(sum>n) return i;
            }
        };
        
        return enemy.length;
    }
}