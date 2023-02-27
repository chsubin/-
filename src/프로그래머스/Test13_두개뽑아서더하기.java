package 프로그래머스;
/*
정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 
더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 
하도록 solution 함수를 완성해주세요.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Test13_두개뽑아서더하기 {
	public static void main(String[] args) {
		int [] numbers= {2,1,3,4,1};
		ArrayList<Integer> sum = new ArrayList<>();
		
		
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(!sum.contains(numbers[i]+numbers[j]))sum.add(numbers[i]+numbers[j]);
			}
		}
		int [] answer = new int [sum.size()];
		for(int i=0;i<sum.size();i++) {
			answer[i]=sum.get(i);
		}
		Arrays.sort(answer);
		
	}
	
}
