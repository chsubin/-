import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
		int na = score.length%m;
		int sum=0;
		
		for(int i=na;i<score.length;i+=m) {
			sum+=score[i]*m;
		}
		answer=sum;
		if(score.length<m) answer=0;
        return answer;
    }
}