class Solution {
    public int solution(String s) {
        int answer = 0;
        int min = 2000;
        for(int i=1;i<s.length();i++){ //문자열단위의 개수
            int len = s.length();
            for(int j=i;j<=s.length();j+=i){
                int replay =0;
                while(j+i<=s.length()){
                    String a = s.substring(j-i,j);
                    String b = s.substring(j,j+i);
                    if(a.equals(b)) {
                        replay+=i;
                       j+=i;
                    }
                    else break;
                }
                if(replay!=0){
                    String str = (replay/i+1)+"";
                    len = len-replay+str.length();
                }
            } 
            if(min>len) {min = len;}
        }
        return min==2000?1:min;
    }
}