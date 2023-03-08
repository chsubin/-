package 프로그래머스course2;

import java.util.HashMap;

public class Test18_위장 {
	public static void main(String[] args) {
		int answer =0;
		String [][] clothes = {{"yellow_hat", "headgear"}, //종류
				{"blue_sunglasses", "eyewear"},
				{"green_turban", "headgear"}};
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0;i<clothes.length;i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}
		 
		int mul=1;
		for(int value:map.values()) {
			mul*= value+1;
		}
		answer = mul-1;
		
		System.out.println(answer);
	}
}
