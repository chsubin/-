package baekjoon;

import java.util.Scanner;

public class Exam1_Sort {
	public static void main(String[] args) {
		int[]array;
		int temp;
		int []a = {10,5,7,2,1,6,3,9,4,8};
		
		for(int i=0;i<9;i++) {
			int j=i;
			while(a[j]>a[j+1]) {
				temp=a[j];a[j]=a[j+1];a[j+1]=temp;
				if (j==0)break;
				j--;
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(a[i]);
		}
		
	
	}
}
