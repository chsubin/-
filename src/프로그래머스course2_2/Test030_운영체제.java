package 프로그래머스course2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Test030_운영체제 {
	public static void main(String[] args) {
		int [][] programs = {
				{2,0,10}, //점수(2), 호출시간(1),수행시간
				{1,5,5},
				{3,5,3},
				{3,12,2}
		};
		long [] answer = new long [10]; //점수가 i인 대기시간의 합
		int [] start = new int [programs.length];
		Arrays.sort(programs,(A,B)->{ //호출시간 빠른순,점수 빠른 순으로 정렬
			int result =0;
			if(A[1]!=B[1]) {
				result = A[1]-B[1];
			}
			else {
				result = A[0]-B[0];
			}
			return result;
		});
		PriorityQueue<int []> queue = new PriorityQueue<>((A,B)->{ //호출시간 빠른순,점수 빠른 순으로 정렬
			int result =0;
			if(A[0]!=B[0]) {
				result = A[0]-B[0];
			}
			else {
				result = A[1]-B[1];
			}
			return result;
		});
		
		
		while(true) {
			
			
			
			
		}
		
	}
}
