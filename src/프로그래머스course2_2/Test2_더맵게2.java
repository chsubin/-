package 프로그래머스course2_2;

import java.util.TreeMap;

public class Test2_더맵게2 {
	static int cnt=0;
	static int answer =0;
	public static void main(String[] args) {
		int [] scoville = {1,2,3};
		cnt = 11;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int a:scoville) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		
		solution(map);
		System.out.println(answer);
		
	}
	private static int solution(TreeMap<Integer, Integer> map) {
		System.out.println(map);
		int min1 = 0;
		int min2 = 0;
		int count =0;
		while(true) {
			for(int su : map.keySet()) {
				if(count==0) {
					min1 = su;
					map.put(min1, map.get(min1)-1);
					if(map.get(min1)==0) map.remove(min1);
					break;
				}
				else {
					min2 = su;
					map.put(min2, map.get(min2)-1);
					if(map.get(min2)==0) map.remove(min2);
					break;
				}
			}
			if(count==1)break;
			count++;
		}
		if(min1<cnt) {
			map.put(min1+(min2*2), map.getOrDefault(min1+(min2*2),0)+1);
			answer++;
			if(map.size()==1&&map.get(min1+(min2*2))==1&&min1+(min2*2)<cnt) {answer=-1;return 0;}
			
			solution(map);
		}
		else {
			map.put(min1, map.getOrDefault(min1, 0)+1);
			map.put(min2, map.getOrDefault(min2, 0)+1);
		}
		
		return 0;
	}
}
