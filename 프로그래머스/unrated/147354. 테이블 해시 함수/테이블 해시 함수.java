import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        Arrays.sort(data,(int []o1,int[] o2)->{
            if (o1[col-1]!=o2[col-1]){
                return o1[col-1]-o2[col-1]; //col번재 컬럼 오름차순
            }
            else {
                return o2[0]-o1[0]; //첫번쨰 컬럼 내림차순
            }
        }); //정렬
        int res = 0;
        for(int i=row_begin-1;i<row_end;i++){
            int a = 0;
            for(int j=0;j<data[i].length;j++){
                a+=data[i][j]%(i+1);
            }
            if(i==row_begin-1) res = a;
            else res = res^a;
        }
        
        answer = res;
        return answer;
    }
}