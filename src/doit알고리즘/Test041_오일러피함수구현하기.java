package doit알고리즘;

import java.io.*;

public class Test041_오일러피함수구현하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		long result = n;
		
		for(long p=2;p<=Math.sqrt(n);p++) {
			if(n%p==0) {//소인수인지 확인
				result = result - result/p;
				while(n%p==0) {
					n/=p;
				}
			}
		}
		if(n>1) {
			result = result-result/n;
		}
		System.out.println(result);
		
		
	}
}
