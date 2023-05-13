import java.util.*;
class Solution {
    static int [] card;
    static ArrayList<Integer> list;
    static boolean visit [];
    public int solution(int[] cards) {
        int answer = 0;
        visit = new boolean [cards.length];
        list = new ArrayList<>();
        card = cards;
        for(int i=0;i<card.length;i++){
            DFS(i,1);
        }
        Collections.sort(list,(o1,o2)->{
            return o2-o1;
        });
        if(list.size()>1){
            answer = list.get(0)*list.get(1);
        }
        else answer = 0;
        
        return answer;
    }
    private static void DFS(int i,int depth){
        int now = card[i]-1;
        if(visit[i]) return;
        visit[i] = true;
        if(visit[now]==true){
            list.add(depth);
            return;
        }
        DFS(now,depth+1);
        
    }
}