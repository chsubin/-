package 프로그래머스course3;

import java.util.ArrayList;

public class Test2_이중우선순위큐 {

	public static void main(String[] args) {
		// 
		String [] operation = {"I 16","I -5643","D -1","D 1","D 1","I 123","D -1"};
		
		ArrayList<Integer> su = new ArrayList<>();
		
		for(int i=0;i<operation.length;i++) {
			if(operation[i].charAt(0)=='I') {
				operation[i].substring(2);
				
			}
			else {
				if(operation[i].contains("-")) {
					operation[i].substring(3);
				}
				else {
					operation[i].substring(2);
					
				}
				
			}
			
		}
		
		
		
	}
	
	
	
}
