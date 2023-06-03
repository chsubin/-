class Solution {
    public int solution(String s) {
        int min = 2000;
        for(int i=1;i<s.length();i++){
            //문자열 압축단위
            int len = s.length();
            for(int j=i;j<=s.length();j+=i){
                int replay = 0; //j가 기준
                while(j+i<=s.length()){
                    String a = s.substring(j-i,j);//전
                    String b = s.substring(j,j+i);//후
                    if(a.equals(b)){ //전후비교하여 같으면 반복된거임
                        replay++;
                        j+= i;
                    }
                    else break;
                }
                if(replay!=0){
                    String str = replay +1 +"";
                    len = len -replay*i +str.length();
                }
            }
            if(min>len){min = len;}
        }
        return min==2000?1:min;
        //return min;
    }
}