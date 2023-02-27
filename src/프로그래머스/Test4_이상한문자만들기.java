package 프로그래머스;

public class Test4_이상한문자만들기 {
	/*
	문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
	각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
	  */
	public static void main(String[] args) {
		String s = "thank  you     for your helping";
		
		StringBuilder builder = new StringBuilder();
			int num=0;
			for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				builder.append(" ");
				num=-1;
			}
			else if(num%2==0) {
				builder.append(Character.toUpperCase(s.charAt(i)));
			}
			else {
				builder.append(Character.toLowerCase(s.charAt(i)));
			}
			num++;			
		}
		String answer= String.valueOf(builder);
		System.out.println(answer);
		
	}
}
