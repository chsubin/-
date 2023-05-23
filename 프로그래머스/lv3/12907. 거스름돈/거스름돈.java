import java.util.*;
class Solution {
    public int solution(int n, int[] money) {
        int answer = 0;
        Arrays.sort(money);
        int N = money[money.length-1];
        int []dp = new int [n+1];
        
        for(int i=0;i<dp.length;i++){
            if(i%money[0]==0) dp[i] = 1;
        }
        for(int i=1;i<money.length;i++){
            for(int j=0;j<dp.length;j++){
                if(money[i]<=j) dp[j] =(dp[j]+dp[j-money[i]])%1000000007;
            }
        }
        answer = dp[dp.length-1];
        

        
        return answer;
    }
}