import java.util.*;
class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->{return o2-o1;});
        int sum = 0;
        answer = enemy.length;
        for(int i=0;i<enemy.length;i++){
            sum += enemy[i];
            queue.add(enemy[i]);
            while(sum>n){
                if(k==0) {return i;}
                else{
                    k--;
                    int a = queue.poll();
                    sum-= a;
                }
                
            }
            
        }
        
        
        return answer;
    }
}