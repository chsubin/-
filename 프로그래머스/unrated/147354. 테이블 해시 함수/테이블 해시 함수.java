import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        Arrays.sort(data,(o1,o2)->{ //정렬
            if(o1[col-1]!=o2[col-1]){
                return o1[col-1]-o2[col-1];
            }
            else return  o2[0]-o1[0];
        });
        int answer= 1;
        for(int i=row_begin-1;i<=row_end-1;i++){
            int sum = 0;
            for(int j=0;j<data[0].length;j++){
                sum+=data[i][j]%(i+1);
            }
            if(i==row_begin-1) answer = sum;
            else answer = answer^sum;
        }
        
        
        
        return answer;
    }
}