package 프로그래머스;

import java.util.ArrayList;

public class Test6_스킬체크테스트문제 {
	public static void main(String[] args) {
		String dartResult ="1D2S#10S";
		int answer =0;
		
		int sum=0;
		ArrayList<Integer> number = new ArrayList<>();
		for(int i=0;i<dartResult.length();i++) {
			String str = dartResult.substring(i, i+1);
			String strs="";
			if(i<dartResult.length()-1) {
				strs= dartResult.substring(i, i+2);
			}
			if(strs.equals("10")) {
				number.add(10);
				i++;
			}
			else if(Character.isDigit(str.charAt(0))) {
				number.add(Integer.parseInt(str));
			}
			else if(str.equals("S")) {
				int num = number.get(number.size()-1);
				number.set(number.size()-1, num*1);
			}
			else if(str.equals("D")) {
				int num = number.get(number.size()-1);
				number.set(number.size()-1, num*num);
			}
			else if(str.equals("T")) {
				int num = number.get(number.size()-1);
				number.set(number.size()-1, num*num*num);
			}
			else if(str.equals("*")) {
				int num = number.get(number.size()-1);
				if(number.size()>=2) {
					int num2 = number.get(number.size()-2);
					number.set(number.size()-2, 2*num2);
				}
				number.set(number.size()-1, 2*num);
			}
			else if(str.equals("#")) {
				int num = number.get(number.size()-1);
				number.set(number.size()-1, -1*num);
			}
		}
		for(int i=0;i<number.size();i++) {
			sum+= number.get(i);
		}
		answer = sum;
		System.out.println(answer);
		
		
	}
}
