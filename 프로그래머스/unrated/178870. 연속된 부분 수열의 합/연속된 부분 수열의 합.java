class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int [2];
        int start = 0;
        int last = 0;
        int sum = sequence[0];
        int min =-1;
        while(last<sequence.length){
            if(last<start) break;
            if(sum<k){
                last++;
                if(last==sequence.length) break;
                sum +=sequence[last];
            }
            else if(sum >k){
                start++;
                sum -= sequence[start-1];
            }
        else if(sum==k){
            int len = last - start+1;

            if (min == -1) {
                min = len;
                answer[0] = start;
                answer[1] = last;
            }
            else if(min>len){
                min = len;
                answer[0] = start;
                answer[1] = last;
            }
            if(last+1<=sequence.length-1){
                last++;
                sum +=sequence[last];
                continue;
            }
            else if(start+1<=sequence.length-1){
                start++;
                sum -= sequence[start-1];
                continue;
            }
            break;
        }

        }
        
        
        
        return answer;
    }
}