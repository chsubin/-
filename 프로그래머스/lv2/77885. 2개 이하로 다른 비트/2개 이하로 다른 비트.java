import java.util.*;
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i=0;i<numbers.length;i++){
            answer[i] = function(numbers[i]);
            
        }
        return answer;
    }
    private static long function(long number){
        
        String str = "";
        if(number==0) str = "0";
        else{
            while(number>0){
                str= number%2+str;
                number/= 2;
            }
        }
        if(!str.contains("0")){
            str ="1"+ "0"+str.substring(1);
        }
        else if(str.substring(str.length()-1).equals("0")){
            str = str.substring(0,str.length()-1) +"1";
        }
        else {
            int idx = 0;
            int len = str.length();
            for(int i=str.length()-2;i>=0;i--){
                if(str.substring(i,i+2).equals("01")){
                    idx = i;
                    break;
                }
            }
            if(idx+2<len){
                str = str.substring(0,idx) + "10"+str.substring(idx+2) ;
            }
            else str = str.substring(0,idx) + "10" ;
        }
        long ans = 0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='1')ans += Math.pow(2,str.length()-1-i);
        }
        
        return ans;
        
    }
}