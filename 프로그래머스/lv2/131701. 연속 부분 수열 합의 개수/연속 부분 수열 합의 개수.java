import java.util.*;
class Solution {
    public int solution(int[] elements) {
		int answer = 0;
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=1;i<=elements.length ;i++) {
			for(int j=0;j<elements.length;j++) {
				int cnt =0;
				int sum =0;
				while(cnt<i) {
					sum+=elements[j+cnt>=elements.length?j+cnt-elements.length:j+cnt];
					cnt++;
				}
				set.add(sum);
			}
		}
		answer = set.size();
        return answer;
    }
}