import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int [id_list.length];
        HashMap<String,List<String>> map = new HashMap<>();
        HashMap<String,Integer> mail = new HashMap<>();//메일받은 횟수
        for(String id:id_list){
            mail.put(id,0);
            map.put(id,new ArrayList<>());
        }
        for(String str:report){
            List<String> list = map.get(str.split(" ")[1]);
            if(!list.contains(str.split(" ")[0]))list.add(str.split(" ")[0]);
            map.put(str.split(" ")[1],list);
        }//아이디 -- 나를 신고한 사람 아이디
        for(String id: id_list){
            List<String> list = map.get(id);
            if(list.size()>=k){
                for(String mailid : list){
                    mail.put(mailid, mail.get(mailid)+1);
                }
            }
        }
        for(int i=0;i<id_list.length;i++){
            String id = id_list[i];
            answer[i] = mail.get(id_list[i]);
        }
        
        
        return answer;
    }
}