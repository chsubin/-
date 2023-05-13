import java.util.*;
class Solution {
    static List<int[]> list;
    public int[][] solution(int n) {
        list = new ArrayList<>();
        //재귀호출
        recursion(1,2,3,n);
        
        //배열출력
        int [][] answer = new int [list.size()][2];
        for(int i=0;i<list.size();i++){
            int [] temp = list.get(i);
            answer[i][0] = temp[0];
            answer[i][1] = temp[1];
        }
        return answer;
        
    }
    static void recursion(int start,int via,int end, int n ){
        if(n==1){
            list.add(new int []{start,end});
            return;
        }
        //1번 기둥에서 3번기둥을 거쳐 2번기둥으로
        recursion(start,end,via,n-1);
        list.add(new int [] {start,end});
        //2번 기둥에서 1번 기둥을 거쳐 3번기둥으로
        recursion(via,start,end,n-1);
    }
}