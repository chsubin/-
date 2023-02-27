package 프로그래머스;

import java.util.Arrays;

public class Test25_완주하지못한선수 {
	public static void main(String[] args) {
		String [] participant= {"leo","kiki","eden"};
		String [] completion= {"eden","kiki"};
		String answer="";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0;i<completion.length;i++) {
			if(participant[i]!=completion[i]) {
			answer = participant[i];
			break;
			}
			
		}
		if (answer.equals(""))answer=participant[participant.length-1];

		
		System.out.println(answer);
		
		
		
		
	}
}
