package 프로그래머스;

import java.util.HashSet;

/*
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)
*/
public class Test16_소수찾기 {
	public static void main(String[] args) {
		int n = 10;
		HashSet<Integer> nums = new HashSet<>();
		
		int answer = 0;
		for(int i=2;i<=n;i++) {
			nums.add(i);
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {nums.remove(i);break;};
			}
		}
		answer = nums.size();
		System.out.println(answer);
	}
}
