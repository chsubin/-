package doit알고리즘;

import java.io.*;
import java.util.*;

public class Test080_조약돌꺼내기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double [] prov = new double [51]; //sum : 모둔 조약돌 개수, index:같은색깔의 조약돌, K개의 같은수를 뽑을 확률
		int [] stone = new int [51];//색깔별 조약돌개수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		for(int i=0;i<n;i++) {
			stone[i]= Integer.parseInt(st.nextToken());
			sum += stone[i];
		}
		int K = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=50;i++) {
			double percent = 1;
			int now = i;
			int s = K;
			int su = sum;
			for(int j=1;j<=K;j++) {
				percent = percent*now/su;
				if(percent==0) {prov[i]=0;break;}
				now--;
				su--;
			}
			
			prov[i] = percent;
		}
		double answer=0;
		for(int s:stone) {
			if(s!=0) {
			answer+= prov[s];
			}
		}
		System.out.println(answer);
		
		
	}
}
