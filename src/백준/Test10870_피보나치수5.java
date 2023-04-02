package 백준;

import java.util.*;
import java.io.*;

public class Test10870_피보나치수5 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int [] F = new int [N+1];
		
		if(N==0) System.out.println(0);
		else {
		
			F[0] = 0;
			F[1] = 1;
			for(int i=2;i<=N;i++) {
				F[i] = F[i-1]+F[i-2];
			}
			System.out.println(F[N]);
		}
		
	}
}
