import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(book_time,(String [] o1,String []o2)->{
            return o2[1].compareTo(o1[1]);
        }); //퇴실시간이 제일 나중으로 정렬
        for(int i=0;i<book_time.length;i++){
            String start = book_time[i][0];
            String end = book_time[i][1];
            int S = 60*Integer.parseInt(start.substring(0,2))+Integer.parseInt(start.substring(3));
            int E = 60*Integer.parseInt(end.substring(0,2))+Integer.parseInt(end.substring(3));
            int sw =0;
            for(int j=0;j<list.size();j++){
                int gijun = list.get(j);
                if(E+10<=gijun){
                    list.set(j,S);
                    sw = 1;
                    break;
                }
            }
            if(sw==0){
                list.add(S);
            }
        }
        int answer = list.size();
        
        return answer;
    }
}