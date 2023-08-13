import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] list = new String[players.length];//순위 기준
        HashMap<String,Integer> map = new HashMap<>();//이름 기준
        for(int i=0;i<players.length;i++){
            list[i]=players[i];
            map.put(players[i],i);
        }
        for(String name:callings){
            int rank = map.get(name);
            int rank_ = rank-1;
            String name_ = list[rank_];
            map.put(name_,rank);
            map.put(name,rank_);
            list[rank]=name_;
            list[rank_] =name;
             
        }
        
        
        
        return list;
    }
}