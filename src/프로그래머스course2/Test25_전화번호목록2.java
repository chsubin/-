package 프로그래머스course2;

import java.util.HashMap;
import java.util.HashSet;

public class Test25_전화번호목록2 {
	public static void main(String[] args) {
		String [] phone_book = {"12","123","1235","567","88"};//돌면서 자신의 접두사가 set에 존재하는지 확인한다.
    boolean answer = true;
    HashSet<String> set = new HashSet<>();
    for(String num : phone_book) {
    	set.add(num);
    }
    for(int i = 0 ; i < phone_book.length ; i++)
      for(int j = 1 ; j < phone_book[i].length() ; j++ ) {
          if(set.contains(phone_book[i].substring(0,j))) {
          	answer =false;
          }
       }
		System.out.println(answer);
		
		
	}
}
