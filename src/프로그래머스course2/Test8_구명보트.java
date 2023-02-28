package 프로그래머스course2;

import java.util.Arrays;

public class Test8_구명보트 {
	public static void main(String[] args) {
		
		int [] people = {70,50,80,50};
		int limit =100;
		Arrays.sort(people);
		int answer =0;
		int js =0;
		for(int i=people.length-1;i>=0;i--) {
			if(people[i]==0) continue;
			if(people[js]+people[i]>limit) {answer++;continue;}
            people[js]=0;
			answer++;
            js++;
			continue;
		}
		System.out.println(answer);
	}
}
