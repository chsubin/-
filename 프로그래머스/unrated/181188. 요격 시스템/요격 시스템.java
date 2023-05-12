import java.util.*;
class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        Arrays.sort(targets,(int [] o1,int[]o2)->{
            if(o1[0]!=o2[0]){
                return o1[0]-o2[0];
            }
            else{
                return o1[1]-o2[1];
            }
        });
        int start = targets[0][0];
        int end = targets[0][1];
        for(int i=1;i<targets.length;i++){
            if(start<targets[i][0]) start = targets[i][0];
            if(end>targets[i][1]) end = targets[i][1];
            if(start>=end){
                answer++;
                start = targets[i][0];
                end = targets[i][1];
            }
            
        }
        answer++;
        
        return answer;
    }
}