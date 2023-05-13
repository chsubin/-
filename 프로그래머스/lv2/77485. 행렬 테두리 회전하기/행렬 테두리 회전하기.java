import java.util.*;
class Solution {
    static ArrayList<Integer> list = new ArrayList<>();
    static int su  =0;
    static int [][] A ;
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int [queries.length];{};
        A = new int [rows+1][columns+1];
        int cnt = 1;
        for(int i=1;i<A.length;i++){ //2차원배열생성
            for(int j=1;j<A[0].length;j++){
                A[i][j] = cnt;
                cnt ++;
            }
        }
        for(int i=0;i<queries.length;i++){
            square(new int []{queries[i][0],queries[i][1],queries[i][2],queries[i][3]});
            answer[i] = su;
            su = 0;
        }
        
        
        
        
        return answer;
    }
      private static void square(int arr []){
        int min_row = arr[0];
        int min_col = arr[1];
        int max_row = arr[2];
        int max_col = arr[3];
        int row = min_row;
        int col = min_col;
        int min = 10000;
        while(col<=max_col){
            list.add(A[row][col]);
            min = Math.min(A[row][col],min);
            col ++;
        }
        col --;
        row++;
        while(row<=max_row){
            list.add(A[row][col]);
            min = Math.min(A[row][col],min);
            row++;
        }
        row--;
        col--;
        while(col>=min_col){
            list.add(A[row][col]);
            min = Math.min(A[row][col],min);
            col --;
        }
        col++;
        row--;
        while(row>min_row){
            list.add(A[row][col]);
            min = Math.min(A[row][col],min);
            row --;
        }
        row = min_row;
        col = min_col+1;
        A[min_row][min_col] = list.get(list.size()-1);
        list.remove(list.size()-1);
        while(col<=max_col){
            A[row][col]= list.get(0);
            list.remove(0);
            col ++;
        }
        col --;
        row++;
        while(row<=max_row){
            A[row][col]= list.get(0);
            list.remove(0);
            row++;
        }
        row--;
        col--;
        while(col>=min_col){
            A[row][col]= list.get(0);
            list.remove(0);
            col --;
        }
        col++;
        row--;
        while(row>min_row){
            A[row][col]= list.get(0);
            list.remove(0);
            row --;
        }


        su = min;

    }
}