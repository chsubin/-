package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test003_구간합 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int arrlen =Integer.parseInt(stringTokenizer.nextToken());
        int [] sums = new int [arrlen+1];
		int num = Integer.parseInt(stringTokenizer.nextToken());
		
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int sum =0;
		for(int i=1;i<sums.length;i++) {
			int su =Integer.parseInt(stringTokenizer.nextToken());
            sum +=su;
            sums[i]= sum;
		}
        sum =0;
		for(int i=0;i<num;i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int start = Integer.parseInt(stringTokenizer.nextToken());
			int end = Integer.parseInt(stringTokenizer.nextToken());
            sum = sums[end] - sums[start-1];
            
			System.out.println(sum);
		}
	}
}
