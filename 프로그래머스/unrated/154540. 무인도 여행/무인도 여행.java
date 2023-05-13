import java.util.*;
class Solution {
    static int [][] A;
    static boolean [][] visit;
    static int number =0;
    static ArrayList<Integer> list;
    public int[] solution(String[] maps) {
        
        A = new int [maps.length][maps[0].length()];
        visit = new boolean [A.length][A[0].length];
        list = new ArrayList<>();
        for(int i=0;i<maps.length;i++){
            for(int j=0;j<maps[0].length();j++){
                String target = maps[i].substring(j,j+1);
                if(target.equals("X")){
                    A[i][j]  = 0;
                }
                else A[i][j]= Integer.parseInt(target);
            }
        } //2차원으로 표현 완료
        for(int i=0;i<A.length;i++){ //BFS실행
            for(int j=0;j<A[0].length;j++){
                number=0;
                if(A[i][j]!=0&&!visit[i][j]){
                    BFS(new int []{i,j});
                    if(number!=0)list.add(number);
                }
            }
        }
        Collections.sort(list);
        int[] answer = new int [list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        if (answer.length==0) answer =new int []{-1};
        return answer;
    }
  private static void BFS(int arr[]){
    Queue<int []> queue = new LinkedList<>();
    queue.add(arr);
    while(!queue.isEmpty()){
        int [] B = queue.poll();
        int row = B[0];
        int col = B[1];
        if(visit[row][col]) continue;
        visit[row][col] = true;
        number += A[row][col];
        int [] dx = {0,-1,0,1};
        int [] dy = {-1,0,1,0};
        for(int i=0;i<4;i++){
            int newrow = row+dx[i];
            int newcol = col+dy[i];
            if(newrow<0||newrow>=A.length||newcol<0||newcol>=A[0].length) continue;
            if(!visit[newrow][newcol]&&A[newrow][newcol]!=0){
                queue.add(new int []{newrow, newcol});
            }
        }
        
    }
    
    
    
}
}