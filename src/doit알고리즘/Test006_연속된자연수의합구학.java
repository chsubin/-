package doit알고리즘;

import java.util.Scanner;

public class Test006_연속된자연수의합구학 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M =  sc.nextInt();
		int answer =1;
		int i=0;
		int j=2;
		int sumI =0;
		int sumJ =3;
		while(j!=M) {
			if(sumJ-sumI>=M) {
				if(sumJ-sumI==M) {answer++;}
				i++;
				sumI+=i;
			}
			else {
				j++;
				sumJ+=j;
			}
		}
		System.out.println(answer);
		
	}
}
