package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class test1_숫자짝꿍 {
	public static void main(String[] args) {
		String X = "5525";
		String Y = "1255";
		StringBuilder imsi = new StringBuilder("");
		StringBuilder answer= new StringBuilder("");
		
		StringBuilder y = new StringBuilder(Y);
		
		List<String> arr = new ArrayList<>();
		
		for(int i=0;i<X.length();i++) {
			String istr=X.substring(i,i+1);
			if(y.indexOf(istr)>=0){
				int index = y.indexOf(istr);
				y.delete(index, index+1);
				arr.add(istr);
			}
		}
		Collections.sort(arr,Collections.reverseOrder());
		for(int i=0;i<arr.size();i++) {
			answer.append(arr.get(i));
		}
    if (answer.length()==0) answer.append("-1");
    else if (Pattern.matches("^[0]*$", answer)) {answer.delete(0, answer.length());answer.append("0");};
		System.out.println(answer);
	}
}
