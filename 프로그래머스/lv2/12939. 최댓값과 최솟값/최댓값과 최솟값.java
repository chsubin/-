class Solution {
    public String solution(String s) {
        String []arr1 = s.split(" ");
        int max=Integer.parseInt(arr1[0]);
        int min=Integer.parseInt(arr1[0]);
        for(int i=0;i<arr1.length;i++){
            if(max<Integer.parseInt(arr1[i]))max=Integer.parseInt(arr1[i]);
            else if(min>Integer.parseInt(arr1[i]))min=Integer.parseInt(arr1[i]);
        }
        String answer = min+" "+max;
        return answer;
    }
}