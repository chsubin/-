import java.util.*;
class Solution {
    public int solution(int m, int n, String[] boards) {
        int answer = 0;
        //1. 배열을 탐색하면서 4개가 같은 블록을 찾아 저장 -> 없으면 반복문 탈출
        //2. 저장된 곳을 빈공간으로 바꿈
        //3. 빈공간을 채워줌
        Queue<int []> queue = new LinkedList<>();
        char [][] board = new char[m][n];
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                char ch = boards[i].charAt(j);
                board[i][j] = ch;
            }
        }
        while(true){
            for(int i=0;i<m-1;i++){ //1
                for(int j=0;j<n-1;j++){
                    char ch = board[i][j];
                    if(ch==' ')continue;
                    if(ch!=board[i][j+1]) continue;
                    else if(ch!=board[i+1][j]) continue;
                    else if(ch!=board[i+1][j+1]) continue;
                    queue.add(new int[]{i,j});
                    queue.add(new int[]{i,j+1});
                    queue.add(new int[]{i+1,j});
                    queue.add(new int[]{i+1,j+1});
                }
            }
            if(queue.isEmpty()) break;
            while(!queue.isEmpty()){//2
                int [] arr = queue.poll();
                if(board[arr[0]][arr[1]]!=' '){
                    board[arr[0]][arr[1]] = ' ';
                    answer++;
                }
            }
            for(int j=0;j<n;j++){//3
                String str ="";
                for(int i=m-1;i>=0;i--){
                    if(board[i][j]!=' ') str+= board[i][j];
                }
                for(int i=0;i<m;i++){
                    if(i<str.length()){
                        board[m-i-1][j] = str.charAt(i);
                    }
                    else board[m-i-1][j] = ' ';
                }
            }
            
        }
        
        return answer;
    }
}