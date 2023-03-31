package doit알고리즘;

import java.util.Scanner;

public class Test039_소수팰린드롬수중에서최솟값찾기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] A = new int [10000001];
		
		for(int i=2;i<A.length;i++) {
			A[i]= i;
		}
		for(int i=2;i<=Math.sqrt(A.length);i++) { //소수구하기
			if(A[i]==0) continue;
			for(int j=i+i;j<A.length;j+=i) {
				A[j]=0;
			}
		}
		for(int i=n;i<A.length;i++) { //문자열구하기
			if(A[i]==0)continue;
			String str =A[i]+"";
			String strr = "";
			for(int j=str.length()-1;j>=0;j--) {
				strr +=str.substring(j, j+1);
			}
			if(str.equals(strr)) {
				System.out.println(A[i]);
				break;
			}
		}
		
		
		
	}
}
