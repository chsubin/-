package 프로그래머스course2;

import java.util.Arrays;

public class Test25_전화번호목록 {
	public static void main(String[] args) {
		String [] phone_book = {"12","123","1235","567","88"};
		Arrays.asList(phone_book).stream().map(s->s.replace(" ","")).sorted();
		System.out.println(phone_book.length);
		for(int i=0;i<phone_book.length;i++) {
			System.out.println(phone_book[i]);
		}
		System.out.println(phone_book);
		
	}
}
