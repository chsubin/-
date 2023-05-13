import java.util.*;
class Solution {
    public int[] solution(String[] gems) {
        int[] answer = {0,0};
        int min = 100001;
        TreeSet<String> set = new TreeSet<>();
        
        for(int i=0;i<gems.length;i++){
            set.add(gems[i]);
        }
        //슬라이딩윈도우
        int S =0;
        int E = 0;
        int sw =0;
        TreeMap<String,Integer> map = new TreeMap<>();
        while(true){
            if(map.size()<set.size()){
                if(E>=gems.length)break;
                map.put(gems[E],map.getOrDefault(gems[E],0)+1);
                E++;
            }
            else{
                map.put(gems[S],map.get(gems[S])-1);
                if(map.get(gems[S])==0) map.remove(gems[S]);
                S++;
                if(map.size()<set.size()) {
                    if(min>E-S){
                        min = E-S;
                        sw=1;
                        answer[0] = S;
                        answer[1] = E;
                    }
                
                }
            }
        }
        if (sw==0){
            answer[0] = S+1;
            answer[1] = E;
        }
        
        return answer;
    }
}