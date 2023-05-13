class Solution {
    public int solution(int n) {
        int answer = 0;

        int [] fs = new int [n+1];

        fs[0]=0;
        fs[1]=1;

        
        for(int i=2;i<=n;i++){
          fs[i]= fs[i-1]%1234567+fs[i-2]%1234567;
        }
        
        answer = fs[n]%1234567;
        
        return answer;
    }
}