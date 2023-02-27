package 프로그래머스;

import java.util.HashSet;
import java.util.Set;

/*n/2포켓몬 고르기*/
public class Test15_폰켓몬 {
	public static void main(String[] args) {
		int [] num = {3,3,3,2,2,4};
		int answer = 0;
		
    Set<Integer> numbers = new HashSet<>();
		for(int i=0;i<num.length;i++) {
			numbers.add(num[i]);
		}
		if((num.length/2)>numbers.size()) answer =numbers.size();
		else answer = num.length/2;
		
		System.out.println(answer);
	}
}
