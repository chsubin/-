import java.util.*;
class Solution {
    public int[] solution(int[][] arr) {
        int [] answer = new int [2];
        int n = arr.length-1;
        
        Queue<int []>queue = new LinkedList<>();
        queue.add(new int[]{0,n,0,n});
        while(!queue.isEmpty()){
            int A [] = queue.poll();
            int row1 = A[0];int row2 = A[1];int col1 = A[2];int col2 = A[3];
            //다 같은지 봐야함
            int su = arr[row1][col1];
            boolean flag = true;
            for(int i = row1;i<=row2;i++){
                for(int j=col1;j<=col2;j++){
                    if(su!=arr[i][j])flag = false;
                }
            }
            if(flag){ //원소가 다 같을떄
                answer[su]++;
            }
            else {//다를떄
                int row3= (row1+row2)/2;
                int col3= (col1+col2)/2;
                queue.add(new int []{row1,row3,col1,col3});
                queue.add(new int []{row1,row3,col3+1,col2});
                queue.add(new int []{row3+1,row2,col1,col3});
                queue.add(new int []{row3+1,row2,col3+1,col2});
            }
            
            
        }
        
        
        
        return answer;
    }
}