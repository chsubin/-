package 프로그래머스course2;

import java.util.ArrayList;

public class Test6_짝지어제거하기 {
	public static void main(String[] args) {
		String s = "cdcd";
		int answer=1;
		
		StringBuilder builder = new StringBuilder();
		builder.append(s.substring(0, 1));
		for(int i=1;i<s.length();i++) {
			if(builder.length()!=0&&builder.substring(builder.length()-1).equals(s.substring(i, i+1))) {
				builder.delete(builder.length()-1,builder.length());
			}
			else {
				builder.append(s.subSequence(i, i+1));
			}
		}
		if(builder.length()!=0) {answer=0;}
		
		
		System.out.println(builder);
		System.out.println(answer);
	}
}
