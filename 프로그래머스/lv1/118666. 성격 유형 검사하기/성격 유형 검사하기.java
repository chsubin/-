class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int [] jumsu = {0,3,2,1,0,-1,-2,-3};
        int [] mbti = {0,0,0,0};
        String [] arr = {"R","C","J","A"};
        String [] arr2 = {"T","F","M","N"};
        for(int i=0;i<survey.length;i++){
            String [] type = survey[i].split("");
            boolean flag = false;
            int idx = -1;
            for(int j=0;j<arr.length;j++){
                if(type[0].equals(arr[j])) {flag = true;idx = j;}
                if(type[0].equals(arr2[j])) {idx = j;}
            }
            if(flag) mbti[idx] += jumsu[choices[i]];
            else mbti[idx] -= jumsu[choices[i]];
            
        }
        for(int i=0;i<mbti.length;i++){
            if(mbti[i]>=0){
                answer += arr[i];
            }
            else answer += arr2[i];
        }
        
        return answer;
    }
}