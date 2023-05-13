class Solution {
    static boolean [][] hole;
    static int [][] maps;
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        hole = new boolean [n][m];
        maps = new int [n][m];
        for(int i=0;i<puddles.length;i++){
            int row = puddles[i][1]-1;
            int col = puddles[i][0]-1;
            hole[row][col] = true;
        }
        for(int i=0;i<maps.length;i++){
            if(hole[i][0]) break;
            maps[i][0] = 1;
        }
        for(int i=0;i<maps[0].length;i++){
            if(hole[0][i]) break;
            maps[0][i] = 1;
        }
        for(int i=1;i<maps.length;i++){
            for(int j=1;j<maps[0].length;j++){
                if(hole[i][j]) maps[i][j] = 0;
                else maps[i][j] = maps[i-1][j]%1000000007 + maps[i][j-1]%1000000007;
            }
        }
        answer = (maps[n-1][m-1])%1000000007;
        
        return answer;
    }
}