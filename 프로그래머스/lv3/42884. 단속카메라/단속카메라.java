import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes,(int []o1,int []o2)->{//오름차순정렬
            if(o1[0]!=o2[0]){
                return o1[0]-o2[0];
            }
            else return o1[1]-o2[1];
        });
        int S =routes[0][0];
        int E =routes[0][1];
        for(int i=1;i<routes.length;i++){
            int start = routes[i][0];
            int end = routes[i][1];
            if(S<start) S = start;
            if(E>end) E = end;
            if(S>E){
               S = start;E = end;
                answer++;
            }
        }        
        answer++;
        return answer;
    }
}