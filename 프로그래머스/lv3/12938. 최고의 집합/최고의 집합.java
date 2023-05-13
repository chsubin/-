class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int [n];
        int sum = 0;
        for(int i=0;i<n;i++){
            answer[i] = s/n+1;
            sum += answer[i];
        }
        int su = sum-s;
        for(int i=0;i<su;i++){
            answer[i]--;
            if(answer[i]==0) return new int[]{-1};
        }
        
        
        
        
        return answer;
    }
}