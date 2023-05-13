import java.util.*;
class Solution {
    static ArrayList<Integer> list;
    public long solution(int k, int d) {
        long answer = 0;
        list = new ArrayList<>();
        int su = 0;
        while(true){
            if(su*k>d) break;
            list.add(su*k);
            su++;
        }
        for(int i=0;i<list.size();i++){
            int a = list.get(i);
            int b = (int)Math.sqrt((long)d*d-(long)a*a);
            answer++;
            answer+=b/k;
        }
        
        return answer;
    }
}