package 프로그래머스;

import java.util.Arrays;

public class Test26_과일장수 {
	public static void main(String[] args) {
		int k = 3;
		int m = 4;
		int [] score= {1,2,3,1,2,3,1};
		int answer;
		
		Arrays.sort(score);
		int na = score.length%m;
		int sum=0;
		
		for(int i=na;i<score.length;i+=m) {
			sum+=score[i]*m;
		}
		answer=sum;
		if(score.length<m) answer=0;
		
		System.out.println(sum);
		
		
		
	}
}
