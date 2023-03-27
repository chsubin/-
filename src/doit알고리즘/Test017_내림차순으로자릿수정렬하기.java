package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test017_내림차순으로자릿수정렬하기 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str =  br.readLine().split("");
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				int a1 = Integer.parseInt(str[i]);
				int a2 = Integer.parseInt(str[j]);
				
				if(a1<a2) {String temp = str[i];str[i]=str[j];str[j]=temp;}
			}
		}
		for(String a:str) {
			System.out.print(a);
		}
		
	}
}
