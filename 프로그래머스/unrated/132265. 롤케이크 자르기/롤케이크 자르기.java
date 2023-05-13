import java.util.*;
class Solution {
    public int solution(int[] topping) {
		TreeMap<Integer, Integer> map1 = new TreeMap<>();
		TreeMap<Integer, Integer> map2 = new TreeMap<>();
		
		for(int i=0;i<topping.length;i++) {
			map1.put(topping[i], map1.getOrDefault(topping[i],0)+1);
		}
		int answer =0;
		int now_index=0;
		while(now_index<topping.length) {
			map2.put(topping[now_index], map2.getOrDefault(topping[now_index],0)+1);
			map1.put(topping[now_index], map1.get(topping[now_index])-1);
			if(map1.get(topping[now_index])==0) map1.remove(topping[now_index]);
			if(map2.size()==map1.size()) {
				answer++;
			}
			now_index ++;
		}
        return answer;
    }
}