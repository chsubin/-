package 프로그래머스course2_2;

public class Test013_2개잏로다른비트 {
	public static void main(String[] args) {
		long [] numbers = {2,7};
		long [] answer = new long [numbers.length];
		
			for(int k = 0;k<numbers.length;k++) {
				long num = numbers[k];
				String a = Long.toBinaryString(num);
				long su = numbers[k];
				if(num%2==0) {
					answer[k]=su+1;
				}
				else {
				while(true) {
					su++;
					long su2 = su;
					String b = Long.toBinaryString(su2);
					//a와 b의 비교 //a와 b의 자리수 맞추기
					int a1 = a.length();
					for(int i=a1;i<b.length();i++) {
						a = "0"+a;
					}
					int bigyo = 0;
					for(int i=0;i<a.length();i++) {
						if(!a.substring(i,i+1).equals(b.substring(i, i+1))) {
							bigyo++;
						}
					}
					if(bigyo<=2)break;
				}
				answer[k]= su;
			}
		}
		for(long a:answer) {
			System.out.println(a);
		}
	}
}
