import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
class Solution {
    public int solution(int k, int[] tangerine) {
		int answer = 0;
		
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<tangerine.length;i++) {
			if(map.containsKey(tangerine[i])) {
				map.put(tangerine[i], map.get(tangerine[i])+1);
			}else {
				map.put(tangerine[i], 1);
			}
		}
		for(Integer x : map.keySet()) {
			list.add(map.get(x));
		}
		list.sort(Collections.reverseOrder());
		int sum =0;
		for(int i=0;i<list.size();i++) {
			answer ++;
			sum+=list.get(i);
			if(sum>=k) break;
		}
        return answer;
    }
}