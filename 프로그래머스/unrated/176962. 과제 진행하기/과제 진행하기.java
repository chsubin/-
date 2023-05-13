import java.util.*;
class Solution {
    public String[] solution(String[][] plans) {
        String[] answer = new String [plans.length];
        Arrays.sort(plans,(String [] o1,String[]o2)->{
           return o1[1].compareTo(o2[1]);
        });
        Stack<String []> stack = new Stack<>();
        int cur_time =0;
        String cur_sub ="";
        int end_time = 0;
        int index =0;
        for(int i=0;i<plans.length;i++){
            cur_time =Integer.parseInt(plans[i][1].substring(0,2))*60 + Integer.parseInt(plans[i][1].substring(3));
            if(cur_time<end_time){
                stack.add(new String[]{cur_sub,end_time-cur_time+""});
            }//현재과목 저장하기
            else{//멈춘과목 꺼내오기
                if(!cur_sub.equals("")){
                    answer[index] = cur_sub;
                    index++;
                }
                System.out.println(cur_sub);
                int time = cur_time-end_time;
                while(!stack.isEmpty()){
                    String [] subs = stack.pop();
                    if(time>=Integer.parseInt(subs[1])){
                       time -= Integer.parseInt(subs[1]);
                        answer[index] = subs[0];
                        index++;
                    }
                    else{
                        subs[1] = Integer.parseInt(subs[1])-time+"";
                        stack.add(subs);
                        time=0;
                    }
                    if(time==0)break;
                }
            }
            cur_sub = plans[i][0];//현재과목
            end_time = cur_time+Integer.parseInt(plans[i][2]);

        }
        answer[index] = cur_sub;
        index++;
        while(!stack.isEmpty()){
            String [] subs = stack.pop();
            answer[index] = subs[0];
            index++;
        }
        
        
        
        
        return answer;
    }
}