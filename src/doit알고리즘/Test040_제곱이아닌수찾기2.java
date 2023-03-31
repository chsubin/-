package doit알고리즘;

import java.util.*;

public class Test040_제곱이아닌수찾기2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long Min = sc.nextLong();
		long Max = sc.nextLong();
		
		HashSet<Long> set = new HashSet<>();
		
		
		for(long i=2;i*i<=Max;i++) {//범위안에서 각각의 제곱수 찾기
			long pow = i*i;
			System.out.println(pow);
			long start_index = Min/pow;
			
			if(Min%pow!=0) { start_index++; }
			 
			for(long j=start_index;pow*j<=Max;j++) {
				set.add(pow*j);
			}
		}
		System.out.println((Max-Min+1)- set.size());
	}	
}
