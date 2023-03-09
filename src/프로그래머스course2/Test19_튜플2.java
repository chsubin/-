package 프로그래머스course2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Test19_튜플2 {
	public static void main(String[] args) {
		
		String s= "{{4,2,3},{3},{2,3,4,1},{2,3}}";
		
    List<String> list = new ArrayList<>();

    //괄호를 제거하여 각 집합을 숫자와 ,로 이루어진 문자열로 만든다.
    int start = 2;
    for(int end = 2; end < s.length()-1; end++) {
        if(s.charAt(end) == '}'){
            list.add(s.substring(start, end));
            start = end+3;
        }
    }

    //집합을 길이를 기준으로 오름차순으로 정렬한다.
    Collections.sort(list, (s1, s2) -> s1.length() - s2.length());

    //중복을 허용하지 않는 Set 자료구조를 사용하여 튜플을 만든다.
    //순서를 유지해야하기 떄문에 LinkedHashSet 사용
    Set<Integer> set = new LinkedHashSet<>();

    //집합의 원소들을 차례대로 set에 add한 결과는 튜플이다.
    for(String str : list) {
        StringTokenizer st = new StringTokenizer(str, ",");

        while(st.hasMoreTokens()) {
            set.add(Integer.parseInt(st.nextToken()));
        }
    }

    //반환 타입이 배열이기 때문에 set을 배열로 변환하여 반환한다. 
    List<Integer> temp = new ArrayList<>(set);
    int[] answer = new int[temp.size()];

    for(int i = 0; i < temp.size(); i++) {
      answer[i] = temp.get(i);
    }
	}
}
