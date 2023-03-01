package 프로그래머스course2;

import java.util.Arrays;

public class Test11_N개의최소공배수 {
	public static void main(String[] args) { 
		//최소공배수를 단계적으로 구해나가면 됨.....
		
		int [] arr = {2,6,8,14};
		
		int answer = 1;
		Arrays.sort(arr);
		
		int bigyo = arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			int a = arr[i+1];
			int b = bigyo;
			int min = a*b ;
			int max = 0;
			while(true) {
				if(a%b==0) {
					max = b;
					bigyo =min/max;
					break;
				}
				int temp;
				temp = a; 
				a = b;
				b = temp%b;
			}
		}
		answer = bigyo;
		System.out.println(answer);
	}
}
