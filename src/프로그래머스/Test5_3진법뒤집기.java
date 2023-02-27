package 프로그래머스;
/*
 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요. 
 */
public class Test5_3진법뒤집기 {
	public static void main(String[] args) {
		int n = 125;
		StringBuilder builder = new StringBuilder();
		while(n>0) {
			builder.append(n%3);
			n=n/3;
		}
		int answer=0;
		builder.reverse();
		for(int i=0;i<builder.length();i++) {
			answer+= Math.pow(3, i)*Integer.parseInt(builder.substring(i, i+1));
		}
		System.out.println(answer);
	}

}
