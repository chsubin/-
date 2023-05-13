class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while(storey>0){
            int na = storey%10;
            if(na>5){
                answer += 10-na;
                storey  = storey/10+1;
                
            }
            else if(na<5){
                answer +=na;
                storey /= 10;
            }
            else{
                if(storey%100/10>=5){
                    answer += 10-na;
                    storey  = storey/10+1;
                }
                else {
                    answer +=na;
                    storey /= 10;
                }
            }

        }
        
        
        
        return answer;
    }
}