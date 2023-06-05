import java.util.*;
class Solution {
    public String solution(int n) {
        String answer = find(n-1).toString();
        
        return answer;
    }
    private static  StringBuilder find(int n){
        String [] A = {"1","2","4"};
        StringBuilder sb = new StringBuilder();
        int a = n/3-1;
        int b = n%3;
        if(a<0){
            sb.append(A[b]);
        }
        else if(a<3){
            sb.append(A[a]);
            sb.append(A[b]);
        }
        else{
            sb.append(find(a));
            sb.append(A[b]);
        }
        return sb;
        
    }
}