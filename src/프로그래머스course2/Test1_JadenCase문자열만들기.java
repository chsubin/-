package 프로그래머스course2;

public class Test1_JadenCase문자열만들기 {
	public static void main(String[] args) {
		String s = "for the loast week";
		String answer="";
		
		StringBuilder builder = new StringBuilder();
		
		int sw=0;
		for(int i=0;i<s.length();i++) {
			char a =s.charAt(i);
			if(i==0||(sw==1&&a>10)) {
				builder.append(Character.toUpperCase(a));
			}
			else if(sw==1&&a<10) {
				builder.append(a);
			}
			else {
				builder.append(Character.toLowerCase(a));
			}
			sw=0;
			if(a==' ') {
				sw=1;
			}
		}
		
		System.out.println(builder);
	}
}
