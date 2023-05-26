import java.util.*;
class Solution {
    static int [][] map ;
    static boolean [][] visit;
    static int answer = 0;
    public int solution(int[][] maps) {
        map = maps;
        visit = new boolean [map.length][map[0].length];
        
        BFS(maps.length-1,maps[0].length-1);
        
        return answer==0?-1:answer;
    }
    public static void BFS(int n,int m){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int []{0,0,1});
        while(!queue.isEmpty()){
            int [] A = queue.poll();
            int x = A[0];
            int y = A[1];
            int depth = A[2];
            if(visit[x][y]) continue;
            if(x==n&&y==m) {answer = depth;return;}
            visit[x][y] = true;
            int [] dx = {-1,0,1,0};
            int [] dy = {0,-1,0,1};
            for(int i=0;i<4;i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx>n||nx<0||ny>m||ny<0) continue;
                if(map[nx][ny]==0) continue;
                queue.add(new int[]{nx,ny,depth+1});
            }
            
            
        }
        
        
    }
}