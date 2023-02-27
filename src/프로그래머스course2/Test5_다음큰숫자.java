package 프로그래머스course2;

import java.util.ArrayList;

public class Test5_다음큰숫자 {
	public static void main(String[] args) {
		int n = 78;
		int answer=0;
		
		while(true) {
			n++;
			if(Integer.bitCount(n)==4) break;
		}
		answer=n;
		System.out.println(answer);
	}
}
