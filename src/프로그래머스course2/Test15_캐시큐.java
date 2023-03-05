package 프로그래머스course2;

import java.util.LinkedList;
import java.util.Queue;

public class Test15_캐시큐 {
	public static void main(String[] args) {
		int answer =0;
		String [] cities = {"A","B","A"};
		int cacheSize = 3;
		
		
		Queue<String> que =new LinkedList<>(); //순서대로 출력
		
		for(int i=0;i<cities.length;i++) {
			String city = cities[i];
			cities[i]="";
			int sw =0;
			for(int j=0;j<city.length();j++) {
				cities[i] +=  Character.toUpperCase(city.charAt(j))+"";
			}
			
			if(que.contains(cities[i])) {
				answer += 1;
				sw=1;
			};
			if(sw==0) {
				answer +=5;
			}
			if(sw==1) que.remove(cities[i]);
			que.add(cities[i]);
			if(que.size()>cacheSize) {
				que.poll();
			}
		}
		
		System.out.println(answer);
	}
}
