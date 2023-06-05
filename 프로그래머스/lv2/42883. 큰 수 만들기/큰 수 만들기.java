class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int idx =-1;
        for(int i=0;i<number.length()-k;i++){ //선택 횟수
            int max = 0;
            System.out.println(i+1+". "+(number.length()-k+i-1));
            for(int j = idx+1;j<number.length()-k+i-1;j++){
                if(max<Integer.parseInt(number.substring(j,j+1))){
                    max = Integer.parseInt(number.substring(j,j+1));
                    idx = j;
                }
            }
            answer+= number.substring(idx,idx+1);
            
        }
        
        
        
        return answer;
    }
}