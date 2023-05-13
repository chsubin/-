import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
		int [] answer = new int[score.length];
		int [] an = new int[k];
		
		int min=2000; 
		if(k>answer.length) {
			for(int i=0;i<score.length;i++) {
				an[i]=score[i];
				if(min>score[i]) {min=score[i];}
				answer[i]=min;
			}
            return answer;
		}
		
		min=2000; 
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
        return answer;
    }
}