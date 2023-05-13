import java.util.*;
class Solution {
    static ArrayList<Integer> A = new ArrayList<>();
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double [ranges.length];
        A.add(k); 
        cal(k);
        double [] sums = new double [A.size()];
        sums[0]  = 0;
        for(int i=1;i<sums.length;i++){
            int S = A.get(i-1);
            int E = A.get(i);
            sums[i] =(S+E)/(double)2+sums[i-1];
        } //넓이의 구간합
        for(int i=0;i<ranges.length;i++){
            int S = ranges[i][0];
            int E = ranges[i][1];
            if(sums.length-1+E<0||S>=sums.length){
                answer[i] = -1;
            }
            else answer[i] =  sums[sums.length-1+E] - sums[S]>=0?sums[sums.length-1+E] - sums[S]:-1;
        }
        
        return answer;
    }
    private static void cal(int k){
        int su = 0;
        if(k%2==0) su = k/2;
        else su = k*3+1;
        A.add(su);
        if(su==1) return;
        else cal(su);
    }
    
}