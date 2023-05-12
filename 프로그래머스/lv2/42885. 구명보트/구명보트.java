import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int js=0;
		for(int i=people.length-1;i>=0;i--) {
			if(people[i]==0) continue;
			if(people[js]+people[i]>limit) {answer++;continue;}
            people[js]=0;
			answer++;
            js++;
			continue;
		}
                return answer;
    }

}