package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class Test24_체육복 {
	public static void main(String[] args) {
		int n = 5;
		int [] lost = {2,4};
		int [] reserve = {3};
		int answer=0;
		
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
		System.out.println(answer);
		
	}
}
