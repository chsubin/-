import java.util.*;
class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        
        int[] answer = new int [enroll.length];
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,String> refers = new HashMap<>();
        for(int i=0;i<enroll.length;i++){
            map.put(enroll[i],0);
            refers.put(enroll[i],referral[i]);
        }
        
        for(int i=0;i<seller.length;i++){
            String person = seller[i];
            int price = 100* amount[i];
            map = dfs(person,price, refers,map,enroll);
            
        }
        for(int i=0;i<enroll.length;i++){
            answer[i] = map.get(enroll[i]);
        }

        return answer;
    }
    private static HashMap<String,Integer> dfs(String person,int price,HashMap<String,String> refers,HashMap<String,Integer> map,String [] enroll){
        int div = (int)(price*0.1);
        
        map.put(person,map.get(person)+price-div);
        if(div==0) return map;
        if(!refers.get(person).equals("-")){
            dfs(refers.get(person),div,refers,map,enroll);
        }
        return map;
    }
}