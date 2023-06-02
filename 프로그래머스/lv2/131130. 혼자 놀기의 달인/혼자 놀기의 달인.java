import java.util.*;
class Solution {
    static int card[];
    static boolean visit[];
    static PriorityQueue<Integer> queue;
    public int solution(int[] cards) {
        int answer = 0;
        card = new int [cards.length+1];
        for(int i=0;i<cards.length;i++){
            card[i+1] = cards[i];
        }
        queue = new PriorityQueue<>((o1,o2)->{return o2-o1;});
        visit = new boolean[card.length];
        for(int i=1;i<card.length;i++){
            if(!visit[i]){
                function(i,0);
            }
        }
        int a = 0;
        int b = 0;
        if(!queue.isEmpty()){
            a = queue.poll();
        }
        if(!queue.isEmpty()){
            b = queue.poll();
        }
        
        answer = a*b;
        return answer;
    }
    private static void function(int su, int depth){
        if(visit[su]){
            queue.add(depth);
            return;
        }
        visit[su] = true;
        function(card[su],depth+1);
        
    }
    
}