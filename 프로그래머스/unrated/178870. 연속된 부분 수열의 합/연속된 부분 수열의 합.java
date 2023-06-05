class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int [2];
        int start = 0;
        int len =1000001; 
        int end = 0;
        int sum = sequence[0];
        while(true){
            if(sum==k){
                if(len>end-start){
                    answer[0] = start;
                    answer[1] = end;
                    len = end-start;
               }
                sum -= sequence[start];
                start++;
            }
            else if(sum>k){
                sum -= sequence[start];
                start++;
            }
            else {
                end++;
                if(end == sequence.length) break;
                sum+= sequence[end];
                
            }
            
            
        }
        return answer;
    }
}