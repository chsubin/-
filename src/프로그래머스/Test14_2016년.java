package 프로그래머스;
/*
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
0일은 금요일이다.

*/
public class Test14_2016년 {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		int [] arr = {31,29,31,30,31,30,31,31,30,31,30,31};
		int days = 0;
		for(int i=0;i<a-1;i++) {
			days+=arr[i];
		}
		days+=b;
		String [] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
		System.out.println(day[days%7]);
		
		
	}
		
		
		
	
	
	
}
