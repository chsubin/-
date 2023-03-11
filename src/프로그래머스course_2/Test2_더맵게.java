package 프로그래머스course_2;

import java.util.Arrays;

public class Test2_더맵게 {
	static int cnt=0;
	static int answer =0;
	public static void main(String[] args) {
		int [] scoville = {1,1,1,1};
		cnt = 30;
		
		solution(scoville);
		
		System.out.println(answer);
		
	}
	private static void solution(int[] scoville) {
		Arrays.sort(scoville);
		
		int min =0;
		for(int i=0;i<scoville.length;i++) {
			if(scoville[i]!=0) {min= i;break;}
		}
		if(scoville[min]>=cnt) return;
		else {
			if((min+1)>=scoville.length) {answer=-1; return;}
			scoville[min] =scoville[min]+(scoville[min+1]*2);
			scoville[min+1]=0;
			answer++;
			solution(scoville);
		}
	}
}
