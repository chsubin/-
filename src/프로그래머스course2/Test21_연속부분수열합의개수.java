package 프로그래머스course2;

import java.util.HashSet;

public class Test21_연속부분수열합의개수 {
	public static void main(String[] args) {
		int [] elements = {7,9,1,1,4};
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
		System.out.println(answer);
		
		
	}
}
