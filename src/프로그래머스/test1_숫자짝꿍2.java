package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class test1_숫자짝꿍2 {
	public static void main(String[] args) {
		
		String X = "5525";
		String Y = "1255";
		List <Integer>list = new ArrayList<>();
		StringBuilder answer= new StringBuilder();
		
		int [] arrX = new int [10];
		int [] arrY = new int [10];
		int [] arr = new int [10];
		
		for(String x:X.split("")) {
			arrX[Integer.parseInt(x)]++; 
		}
		for(String y:Y.split("")) {
			arrY[Integer.parseInt(y)]++; 
		}
		for(int i=0;i<10;i++) {
			if(arrX[i]>arrY[i]) arr[i]=arrY[i];
			else arr[i]=arrX[i];
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<arr[i];j++) {
				list.add(i);
			}
		}
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0;i<list.size();i++) {
			answer.append(list.get(i));
		}
    if (answer.length()==0) answer.append("-1");
    else if (Pattern.matches("^[0]*$", answer)) {answer.delete(0, answer.length());answer.append("0");};
		System.out.println(answer.toString());
	}
}
