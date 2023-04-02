package doit알고리즘;

import java.util.*;
import java.io.*;

public class Test043_최대공약수구하기 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer  st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long su1 = a>b?a:b;
		long su2 = a>b?b:a;
		
		//두숫자의 최대공약수 구하기
		long na = su1%su2;
		long temp = su2;
		
		while(na!=0) {
			temp = na;
			na = su2%na;
			if(na==0)break;
			su2 = temp;
		}
		for(int i=0;i<temp;i++) {
			bw.write("1");
		}
		bw.flush();
		bw.close();
		
	}
}
