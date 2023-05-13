import java.util.*;
class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        
        int start= 1;
        int end = stations[0] -w-1;
        int ran = 2*w+1;
        for(int i=0;i<stations.length;i++){
            end = stations[i] -w-1;
            if(end>=start){
                answer += (end-start)/ran+1;
            }
            start = stations[i]+w+1;
            if(start>n) break;
            
        }
        if(n>=start){
            answer+=(n-start)/ran+1;
        }
        

        return answer;
    }
}