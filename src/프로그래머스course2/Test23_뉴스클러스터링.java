package 프로그래머스course2;

import java.util.HashSet;
import java.util.Iterator;

public class Test23_뉴스클러스터링 {
	public static void main(String[] args) {
		String str1 = "FRANCE";
		String str2 = "french";
		String s1 = "";
		String s2 = "";
		for(int i=0;i<str1.length();i++) {
			s1+= Character.toUpperCase(str1.charAt(i));
		}
		for(int i=0;i<str2.length();i++) {
			s2+= Character.toUpperCase(str2.charAt(i));
		}
		str1 = s1 ; str2 = s2; //교집합/합집합
		
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		HashSet<String> set3 = new HashSet<>();
		for(int i=0;i<str1.length()-1;i++) {
			System.out.println(str1.substring(i, i+2).matches("^[A-Z]*$"));
			if(!str1.substring(i, i+2).matches("^[A-Z]*$"))continue;
			set1.add(str1.substring(i, i+2)) ;
 			set2.add(str1.substring(i, i+2)) ;
		}
		for(int i=0;i<str2.length()-1;i++) {
			if(!str2.substring(i, i+2).matches("^[A-Z]*$"))continue;
			set1.add(str2.substring(i, i+2));
		}
		Iterator<String> iter = set2.iterator();
		while(iter.hasNext()) {
			String a = iter.next();
			if(str2.contains(a)) {
				set3.add(a);
			}
		}
		System.out.println(set1);
		System.out.println(set3);
		int answer =0;
		
		answer = 65536*set3.size()/set1.size();
		
		System.out.println(answer);
	}
}
