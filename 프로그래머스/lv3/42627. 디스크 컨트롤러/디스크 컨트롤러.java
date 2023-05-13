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
        int cur_time = jobs[0][0]+jobs[0][1];
        index = 1;
        while(true){
            while(index<jobs.length){
                if(jobs[index][0]<=cur_time){
                    queue.add(new int[]{jobs[index][0],jobs[index][1]});
                    index++;
                }
                else break;
            }
            
            if(queue.isEmpty()){
                if(index<jobs.length) {
                    queue.add(new int[]{jobs[index][0],jobs[index][1]});
                    cur_time = jobs[index][0];
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