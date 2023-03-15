package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test005_나머지합구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bs.readLine());
		long answer =0;
		
		int num = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		
		long [] sums = new long [num];
		long [] count = new long [target];
		
		st = new StringTokenizer(bs.readLine());
		int  sum =0;
		for(int i=0;i<num;i++) {
			int number = Integer.parseInt(st.nextToken());
			sum+= number;
			sums[i] = sum%target;
		}
		for(int i=0;i<num;i++) {
			if(sums[i] ==0) {
				answer++;
			}
			count[(int) sums[i]]++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]>1) {
				answer = (int) (answer + (count[i]*(count[i]-1)/2));
			}
		}
		System.out.println(answer);
		
	}
}
