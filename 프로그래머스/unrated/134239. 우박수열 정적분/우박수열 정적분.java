import java.util.*;
class Solution {
    static ArrayList<Integer> list = new ArrayList<>();
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double [ranges.length];
        function(k);
        System.out.println(list);
        int [] arr = new int [list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        double [] width = new double [arr.length];
        for(int i=1;i<arr.length;i++){
            width[i] = width[i-1] + (arr[i]+arr[i-1])/2.0;
        }
        for(int i=0;i<ranges.length;i++){
            int start = ranges[i][0];
            int end = arr.length-1+ ranges[i][1];
            if(start>end) answer[i] = -1;
            else answer[i] = width[end]-width[start];
            
        }
        return answer;
    }
    private static void function(int su){
        list.add(su);
        if(su==1) return;
        if(su%2==0) su/=2;
        else su = su*3+1;
        function(su);
    }
    
}