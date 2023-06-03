import java.util.*;
class Solution {
    static ArrayList<Integer> list = new ArrayList<>();
    public int solution(String[][] book_time) {
        Arrays.sort(book_time,(o1,o2)->{
            //입실시간
            int in1 = Integer.parseInt(o1[0].substring(0,2))*60
                + Integer.parseInt(o1[0].substring(3));
            int in2 = Integer.parseInt(o2[0].substring(0,2))*60
                + Integer.parseInt(o2[0].substring(3));
            //퇴실시간
            int out1 = Integer.parseInt(o1[1].substring(0,2))*60
                + Integer.parseInt(o1[1].substring(3));
            int out2 = Integer.parseInt(o2[1].substring(0,2))*60
                + Integer.parseInt(o2[1].substring(3));
            if(out1!=out2) return out2 - out1;
            else return in2- in1;
        });
        for(int i=0;i<book_time.length;i++){
            int in = Integer.parseInt(book_time[i][0].substring(0,2))*60
                + Integer.parseInt(book_time[i][0].substring(3));
            int out = Integer.parseInt(book_time[i][1].substring(0,2))*60
                + Integer.parseInt(book_time[i][1].substring(3));
            int sw = 0;
            for(int j=0;j<list.size();j++){
                if(out<=list.get(j)){//입실할수 있는 방이 있을때
                    list.set(j,in-10);
                    sw = 1;
                    break;
                }
            }
            if(sw ==0){
                list.add(in-10);
            }
            
        }
        
        
        return list.size();
    }
}