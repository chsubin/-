import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
		Arrays.sort(reserve);
		List<Integer> hlost = new ArrayList<Integer>();
		HashSet<Integer> hreserve = new HashSet<>();
		int cnt=0;
		for(int i=0;i<reserve.length;i++) {
			hreserve.add(reserve[i]);
		}
		for(int i=0;i<lost.length;i++) {
			if(hreserve.contains(lost[i])) {
				hreserve.remove(lost[i]);
				continue;
				}
			hlost.add(lost[i]);
		}
		for(int i:hlost) {
			int pre=i-1;
			int post = i+1;
			if(hreserve.contains(pre)) {
				hreserve.remove(pre);
				continue;
			}
			else if(hreserve.contains(post)) {
				hreserve.remove(post);
				continue;
			}
			cnt++;
		}
		answer = n-cnt;
        return answer;
    }
}