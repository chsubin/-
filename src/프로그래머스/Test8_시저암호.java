package 프로그래머스;
/*
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 
문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
*/
public class Test8_시저암호 {
	public static void main(String[] args) {
		String s ="AB";
		int n =1;
		
		String answer = "";
    int [] arr = new int [s.length()];
    
		
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			System.out.println((int)s.charAt(i));
			if(s.charAt(i)==' ') {
				arr[i]=s.charAt(i);
			}
			else arr[i]=s.charAt(i)+n;
			if(arr[i]>122) {
				arr[i]= arr[i]-26;
			}
			else if(s.charAt(i)<97&&arr[i]>90) {
				arr[i]= arr[i]-26;
			}
		}
		for(int i=0;i<s.length();i++) {
		  builder.append(String.valueOf((char)arr[i]));
		}
		answer = String.valueOf(builder) ;
		System.out.println(answer);
	}
}
