package 프로그래머스course2;

import java.util.HashMap;

public class Test29_할인행사 {
	public static void main(String[] args) {
		String [] want = {"apple"} ;
		int [] number = {10};
		String [] discount = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};
		
		int answer =0;
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0;i<=discount.length-10;i++) {
			int sw=0;
			for(int j=0;j<10;j++) {
				map.put(discount[i+j], map.getOrDefault(discount[i+j], 0)+1); //할인하는날 먼저 처리
			}
			System.out.println(map);
			for(int k=0;k<want.length;k++) { //장바구니 반복문돌기
				if(map.containsKey(want[k])) { //장바구니 안에 있는것이 할인할때
					if(map.get(want[k])>number[k]) {
						sw=1;
						break;
					}
				}
				else { //할인하지않을떄
					sw=1;
					break;
				}
			}
			if(sw==0)answer ++;
			map.clear();
		}
		System.out.println(answer);
	}
}
