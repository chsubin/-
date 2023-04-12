package 프로그래머스course2_2;

public class Test016_뒤에있는큰수찾기 {
	public static void main(String[] args) {
		int [] numbers = {2, 3, 3, 5};
		int [] answer = new int [numbers.length];
		answer[numbers.length-1] = -1;
		
		int max = numbers[numbers.length-1];
		for(int i=numbers.length-2;i>=0;i--) {
			if(max<numbers[i]) {
				max = numbers[i];
			}
			if(numbers[i]<numbers[i+1]) {
				answer[i] = numbers[i+1];
			}
			else {
					if(numbers[i]>=max) {
						answer[i] = -1;
					}
					else {
						int sw =0;
						for(int j=i+1;j<answer.length;j++) {
							if(numbers[i]<answer[j]) {
								answer[i] = answer[j];
								sw =1;
								break;
							}
						}
						if(sw ==0) answer[i] = -1;
					}
			}
		}
		for(int a:answer) {
			System.out.println(a);
		}
		
	}
}
