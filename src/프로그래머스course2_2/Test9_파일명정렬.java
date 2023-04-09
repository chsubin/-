package 프로그래머스course2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

public class Test9_파일명정렬 {
	public static void main(String[] args) {
		String [] files = {"img000012345", "img1.png","img2","IMG02"};//
		Arrays.sort(files,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String [] O1 = new String [3];
				String [] O2 = new String[3];
				int head =0;
				String temp ="";
				int number =0;
				int tail = 0;
				for(int i=1;i<o1.length();i++) {
					if(!Pattern.matches("[0-9]", o1.charAt(i-1)+"")) {//전글자가 알파벳
						temp+= Character.toUpperCase(o1.charAt(i-1));
						if(Pattern.matches("[0-9]", o1.charAt(i)+"")) {//현글자가 숫자
							head = i-1;
							number = i;
						}
					}
					if(Pattern.matches("[0-9]", o1.charAt(i-1)+"")){
						if(!Pattern.matches("[0-9]", o1.charAt(i)+"")){
							tail = i;
							break;
						}
					}
				}
				if(tail==0) tail = o1.length()>=5?5:o1.length();
				tail = tail - number > 5?number+5:tail;
				O1[0] = temp;
				System.out.println(o1);
				System.out.println(number);
				System.out.println(tail);
				O1[1] = o1.substring(number,tail);
				temp ="";
				for(int i=1;i<o1.length();i++) {
					if(!Pattern.matches("[0-9]", o2.charAt(i-1)+"")) {//전글자가 알파벳
						temp+= Character.toUpperCase(o2.charAt(i-1));
						if(Pattern.matches("[0-9]", o2.charAt(i-1)+"")) {//현글자가 숫자
							head = i-1;
							number = i;
						}
					}
					if(Pattern.matches("[0-9]", o2.charAt(i-1)+"")){
						if(!Pattern.matches("[0-9]", o2.charAt(i)+"")){
							tail = i;
							break;
						}
					}
				}
				if(tail==0) tail = o2.length()>=5?5:o2.length();
				tail = tail - number > 5?number+5:tail;
				O2[0] = temp;
				O2[1] = o2.substring(tail);
				int result =0;
				if(!O1[0].equals(O2[0])) {
					 result =O1[0].compareToIgnoreCase(O2[0]);
				}
				else {
					if(O1[1].equals(""))O1[1]="0";
					if(O2[1].equals(""))O2[1]="0";
					result = Integer.parseInt(O1[1])-Integer.parseInt(O2[1]);
				}
				return result;
			}
		});
		for(String a : files) {
			System.out.println(a);
		}
		
		
		
		
	}
}
