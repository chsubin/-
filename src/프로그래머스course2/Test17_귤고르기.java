package 프로그래머스course2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Test17_귤고르기 {
	public static void main(String[] args) {
		int k = 6;
		int [] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
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
		
		
		System.out.println(answer);
	}
}
