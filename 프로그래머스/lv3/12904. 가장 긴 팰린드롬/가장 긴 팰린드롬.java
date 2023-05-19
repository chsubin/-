import java.util.*;

class Solution{
    int[][] dp ;
    String s;
    public int solution(String w)
    {
        dp = new int[2501][2501];
        s = w;
        
        for(int[] ws : dp){
            Arrays.fill(ws,-1);
        }
        
        int answer = dfs(1, s.length());

        return answer;
    }
    
    public int dfs(int start, int end){

        if(start == end) return 1;
        if(start > end) return 0;
        if(dp[start][end]!=-1) return dp[start][end];
        
        if(check(s, start-1, end-1)) return dp[start][end] = end-start+1;
        
        return dp[start][end] = Math.max(dfs(start+1,end),dfs(start,end-1));
        
        
    }
    
    public boolean check(String t, int start, int end){
        if(t.length() == 1) return true;
        
        while(start < end){
            if(t.charAt(start++)!=t.charAt(end--)) return false;
        }
        
        return true;
       
    }
}