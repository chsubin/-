class Solution {
    public int[] solution(int brown, int yellow) {
        int x = 0;
        int y = 0;
        for(int i=0;i<brown;i++){
            for(int j=0;j<brown;j++){
                if((2*i+2*(j-2)==brown)&&((i-2)*(j-2)==yellow)) {
                     x = i;
                    y = j;
                }
            }            
        }
        int [] answer ={x,y};
        
        
        
        return answer;
    }
}