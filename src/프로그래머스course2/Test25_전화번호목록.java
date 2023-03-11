package 프로그래머스course2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test25_전화번호목록 {
	public static void main(String[] args) {
		String [] phone_book = {"12","123","1235","567","88"};
		boolean answer = true;
		List<String> arr  =  Arrays.asList(phone_book).stream().sorted((a,b)->{
			return a.length()-b.length();
		}).collect(Collectors.toList()) ;
		
		for(int i=0;i<arr.size();i++) {
			for(int j=i+1;j<arr.size();j++) {
				String a = arr.get(i);
				String b = arr.get(j);
				if(b.startsWith(a)) {
					answer = false;
					break;
				}
			}
		}
		System.out.println(answer);
		
		
		
	}
}
