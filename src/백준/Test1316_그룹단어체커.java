package 백준;

import java.util.*;
import java.io.*;

public class Test1316_그룹단어체커 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String [] strs = new String [N];
		
		for(int i=0;i<N;i++) {
			strs[i] = br.readLine();
		}
		int [] alpha;
		int answer=0;
		
		for(int i=0;i<N;i++) {
			String str = strs[i];
			alpha = new int [26];
			int ex = str.charAt(0);
			alpha[ex-97]++; 
			for(int j=1;j<str.length();j++) {
				int temp = str.charAt(j);
				if(temp == ex) continue;
				alpha[temp-97]++;
				ex = temp;
			}
			boolean flag = true;
			for(int a:alpha) {
				if(a>1) flag=false;
			}
			if(flag)answer++;
		}
		System.out.println(answer);
		
		
		
	}
}
