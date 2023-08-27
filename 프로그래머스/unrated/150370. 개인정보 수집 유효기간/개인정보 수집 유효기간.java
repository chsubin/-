import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        ArrayList<Integer> doc = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<terms.length;i++){
            map.put(terms[i].split(" ")[0],Integer.parseInt(terms[i].split(" ")[1]));
        }
        for(int i=0;i<privacies.length;i++){
            String date = privacies[i].split(" ")[0];
            int mon = map.get(privacies[i].split(" ")[1]);
            String exp = calDate(mon, date);
            //System.out.println(exp);
            if(today.compareTo(exp)>=0) doc.add(i+1);
                        
        }
        int[] answer = new int [doc.size()];
        for(int i=0;i<doc.size();i++){
            answer[i] = doc.get(i);
        }
        
        
        return answer;
    }
    public String calDate(int mon, String date){ //유효기간, 등록된 날짜
        date = date.replace(".","-");
        String [] cal = date.split("-");
        int year = Integer.parseInt(cal[0]);
        int month = Integer.parseInt(cal[1])+mon;
        String day = cal[2];
        if(month>12){
            while(month>12){
                year ++;
                month = month - 12;
            }
        }
        return year+"."+ ("0"+month).substring(("0"+month).length()-2)+"." + day;
    }
}