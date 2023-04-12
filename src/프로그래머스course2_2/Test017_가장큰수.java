package 프로그래머스course2_2;

import java.util.PriorityQueue;

public class Test017_가장큰수 {
	public static void main(String[] args) {
		int [] numbers = {0,0,0,0};
		String answer ="";
		
		PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->{
			String str1 = o1+"";
			String str2 = o2+"";
			int result;
			if( str1.charAt(0)!=str2.charAt(0)) {
				result = str1.charAt(0)-str2.charAt(0);
			}
			else {
				result = (int)(Long.parseLong(str1+str2)-Long.parseLong(str2+str1));
			}
			return -result;
		});
		for(int a:numbers) {
			queue.add(a);
		}
		boolean flag = false;
		while(!queue.isEmpty()) {
			int a = queue.poll();
			if(a!= 0) {
				flag = true;
			}
			answer +=a;
		}
		if(flag) {
			answer = "0";
		}
		System.out.println(answer);
		
	}
}
