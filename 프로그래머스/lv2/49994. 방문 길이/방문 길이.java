import java.util.*;
class Solution {
    public int solution(String dirs) {
		int answer =0;
		int [] now = {0,0};
		TreeSet<String> set = new TreeSet<>();
		for(int i=0;i<dirs.length();i++) {
			String str = dirs.substring(i,i+1);
			
			if(str.equals("U")&&(now[1]+1<=5)) {
				String start = ""+now[0]+now[1];
				now[1] =now[1]+1;
				String end= ""+now[0]+now[1];
				set.add(start+end);
				set.add(end+start);
			}
			else if(str.equals("D")&&(now[1]-1>=-5)) {
				String start = ""+now[0]+now[1];
				now[1] =now[1]-1;
				String end= ""+now[0]+now[1];
				set.add(start+end);
				set.add(end+start);
				
			}
			else if(str.equals("R")&&(now[0]+1<=5)) {
				String start = ""+now[0]+now[1];
				now[0] =now[0]+1;
				String end= ""+now[0]+now[1];
				set.add(start+end);
				set.add(end+start);
			}
			else if(str.equals("L")&&(now[0]-1>=-5)) {
				String start = ""+now[0]+now[1];
				now[0] =now[0]-1;
				String end= ""+now[0]+now[1];
				set.add(start+end);
				set.add(end+start);
			}
		}
		answer = set.size()/2;
        return answer;
    }
}