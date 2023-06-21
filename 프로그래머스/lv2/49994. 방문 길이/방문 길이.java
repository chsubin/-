import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        TreeSet<String> set = new TreeSet<>();
        int [] now = {0,0};
        int [] dx = {0,0,1,-1}; //UDRL
        int [] dy = {1,-1,0,0};
        for(int i=0;i<dirs.length();i++){
            char ch = dirs.charAt(i);
            int [] imsi = {0,0};
            if(ch=='U'){
                imsi[0] = now[0]+dx[0];
                imsi[1] = now[1]+dy[0];
            }
            else if(ch=='D'){
                imsi[0] = now[0]+dx[1];
                imsi[1] = now[1]+dy[1];
            }
            else if(ch=='R'){
                imsi[0] = now[0]+dx[2];
                imsi[1] = now[1]+dy[2];
            }
            else if(ch=='L'){
                imsi[0] = now[0]+dx[3];
                imsi[1] = now[1]+dy[3];
            }
            if(imsi[0]<-5||imsi[0]>5||imsi[1]<-5||imsi[1]>5) continue;
            String road1 = ""+now[0]+now[1]+imsi[0]+imsi[1];
            String road2 = ""+imsi[0]+imsi[1]+now[0]+now[1];
            if(!set.contains(road1)){
                set.add(road1);
                set.add(road2);
            }
            now[0] = imsi[0];
            now[1] = imsi[1];
        }
        answer = set.size()/2;
        
        return answer;
    }
}