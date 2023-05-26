import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        Arrays.sort(jobs,(int[]o1,int []o2)->{ //정렬
            if(o1[0]!=o2[0]) return o1[0]-o2[0];
            else return o1[1]-o2[1];
        });
        PriorityQueue<int []> queue = new PriorityQueue<>((int []o1,int []o2)->{return o1[1]-o2[1];});
        int index = 0;
        int sum = jobs[0][1]; //요청부터 종료까지 걸린시간의 합계
        int cur_time = jobs[0][0]+jobs[0][1]; //현재시간
        index = 1;
        while(true){
            while(index<jobs.length){ //다 돌지 않았을때 
                if(jobs[index][0]<=cur_time){//현재시간보다 요청시간이 빠르면
                    queue.add(new int[]{jobs[index][0],jobs[index][1]});
                    index++;
                }
                else break;
            }
            
            if(queue.isEmpty()){ //현재시간에 요청되어있는것이 없을떄
                if(index<jobs.length) {
                    queue.add(new int[]{jobs[index][0],jobs[index][1]});
                    cur_time = jobs[index][0]; //시간이 옮겨짐
                    index++;
                }
                else break;
            }
            int A [] = queue.poll(); //작업
            cur_time += A[1];
            sum+= cur_time-A[0]; 
            
        }
        
        answer= sum/jobs.length;
        
        return answer;
    }
}