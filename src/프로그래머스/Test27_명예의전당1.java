package 프로그래머스;

import java.util.Arrays;

public class Test27_명예의전당1 {
	public static void main(String[] args) {
		int k = 3;
		int [] score = {0,1,3,0,3,0,5};
		int [] answer = new int[score.length];
		int [] an = new int [k];
		
		int min=100; 
		if(k>answer.length) {
			for(int i=0;i<score.length;i++) {
				an[i]=score[i];
				if(min>score[i]) {min=score[i];}
				answer[i]=min;
			}
		}
		
		min=100; 
		for(int i=0;i<k;i++) {
			an[i]=score[i];
			if(min>score[i]) {min=score[i];}
			answer[i]=min;
		}
		Arrays.sort(an);
		
		for(int i=k;i<score.length;i++) {
			if(an[0]<score[i]) {an[0]=score[i];}
			Arrays.sort(an);
			answer[i]=an[0];
		}
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
		
		
	}
}
