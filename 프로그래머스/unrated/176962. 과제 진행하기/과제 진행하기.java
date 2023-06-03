import java.util.*;
class Solution {
    public String[] solution(String[][] plans) {
        String[] answer = new String [plans.length];
        Arrays.sort(plans,(o1,o2)->{ //정렬
            int time1 = Integer.parseInt(o1[1].substring(0,2))*60+
               Integer.parseInt(o1[1].substring(3));
            int time2 = Integer.parseInt(o2[1].substring(0,2))*60+
               Integer.parseInt(o2[1].substring(3));
            return time1 -time2;
        });
        ArrayList<String> list = new ArrayList<>();
        int cur_time = 0;
        int end_time = 0;
        String cur_sub = "";
        Stack<String []> stack = new Stack<>();
        for(int i=0;i<plans.length;i++){
            cur_time = Integer.parseInt(plans[i][1].substring(0,2))*60+
               Integer.parseInt(plans[i][1].substring(3));
            if(i!=0){
                if(cur_time<end_time){//시간이 부족한경우
                    stack.add(new String[]{cur_sub,end_time-cur_time+""});
                }
                else{ //시간이 딱 맞거나 남는경우
                    list.add(cur_sub);
                    int time = cur_time-end_time; //남은시간
                    while(time>0&&!stack.isEmpty()){ //시간이 남는경우
                        String A [] = stack.pop();
                        cur_sub = A[0];
                        int last_time = Integer.parseInt(A[1]);
                        if(last_time<=time){
                            list.add(cur_sub);
                            time-=last_time;
                        }
                        else{
                            stack.add(new String[]{cur_sub,last_time-time+""});
                            time = 0;
                        }
                    }
                }
            }
            cur_sub = plans[i][0];
            end_time = cur_time +Integer.parseInt(plans[i][2]);   
        }
        list.add(cur_sub);
        while(!stack.isEmpty()){
            list.add(stack.pop()[0]);
        }
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}