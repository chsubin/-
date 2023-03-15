package doit알고리즘;

import java.util.Scanner;

public class Test002_평균구하기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] arr = new int [num];
		int sum=0;
		int max =0;
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
			sum+= arr[i];
			if(max<arr[i]) max = arr[i];
		}
		System.out.println(sum*1.0*100/(max*num));
		
		
	}
}
