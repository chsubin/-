import java.util.*;
class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        Arrays.sort(timetable);
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<timetable.length;i++){
            int su = Integer.parseInt(timetable[i].substring(0,2))*60+Integer.parseInt(timetable[i].substring(3));
            queue.add(su);
        }
        int time = 9*60;
        boolean flag = false;
        int last = 0;
        for(int i=0;i<n;i++){
            int seats = m; //남은자리
            while(!queue.isEmpty()){
                if (seats==0) break;
                if(queue.peek()<=time){ //기다리는사람이 출발전에 왔을때
                    if(i==n-1&&seats==1){flag = true;last = queue.peek()-1;}//마지막사람이 타기전
                    queue.poll(); //차를 탔다.
                    seats--;
                }
                else break; //출발 후에 왔을때
            }
            time+=t;
            
        }
        if(flag == false){ //경쟁하지 않아도 될때
            last = time-t;
            answer += last/60<10?"0"+(last/60):last/60+"";
            answer += ":";
            answer += last%60<10?"0"+(last%60):last%60+"";
        }
        else{ //경쟁해야될때
            answer += last/60<10?"0"+(last/60):last/60+"";
            answer += ":";
            answer += last%60<10?"0"+(last%60):last%60+"";
        }
        
        
        return answer;
    }
}