package 프로그래머스course2_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class Test026_외톨이알파벳 {
	public static void main(String[] args) {
		String input_string = "eeddee";
		ArrayList<Character> list  = new ArrayList<>(); //한번나온것 넣기
		TreeSet<Character> set = new TreeSet<>();
		Stack<Character> stack = new Stack<>();
		list.add(input_string.charAt(0));
		stack.add(input_string.charAt(0));
		for(int i=1;i<input_string.length();i++) {
			char a =  input_string.charAt(i);
			char s = stack.peek();
			if(a!=s) {//전에 나온것이랑 같지 않고
				if(list.contains(a)) {//이미 한번 나왔었따면
					set.add(a);
				}
				list.add(a);
				stack.add(a);
			}
		}
		StringBuilder sb = new StringBuilder();
		Iterator<Character> iter = set.iterator();
		while(iter.hasNext()) {
			sb.append(iter.next());
		}
		if (set.size()==0) {
			sb.append("N");
		}
		System.out.println(sb);
	}

}
