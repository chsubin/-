package 프로그래머스course2;

import java.util.Arrays;

public class Test13_H_index {
	public static void main(String[] args) {
		int [] citations = {0,0,0,0,0};
		int answer =0;
		int  n = citations.length;
		Arrays.sort(citations);
		
		for(int i=citations[citations.length-1];i>=0;i--) {
			int su =0;
			for(int j=citations.length-1;j>=0;j--) {
				if(i<=citations[j]) {
					if(citations[j]!=0) {
						su++;
					}
				}
				if(su>=i) {answer = su;System.out.println("answer : "+answer); break;}
			}
		}
		System.out.println(answer);
		
	}
}
