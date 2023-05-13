import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
		int answer =0;
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0;i<clothes.length;i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}
		 
		int mul=1;
		for(int value:map.values()) {
			mul*= value+1;
		}
		answer = mul-1;
        return answer;
    }
}