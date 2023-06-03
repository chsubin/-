class Solution {
    static int answer = 0;
    public int solution(int storey) {
        function(storey);
        System.out.println(answer);
        return answer;
    }
    private static void function(int number){ //2554
        if(number==0)return;
        int na = number%10;
        if(na<5){
            number -= na;
            answer += na;
        }
        else if(na>5){
            number += 10-na;
            answer += 10-na;
        }
        else{ //na==5
            int su = number%100/10;
            if(su<5) {
                number -= na;
                answer += na;
            }
            else{
                number += 10-na;
                answer += na;
            }   
        }
        function(number/10);
        
    }
}