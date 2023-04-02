package 백준;

import java.io.*;
import java.util.*;

public class Test23971_ZOAC4 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int row = (int) Math.ceil(H/(double)(1+N)); 
		int col = (int) Math.ceil(W/(double)(1+M)); 
		
		System.out.println(row* col);
		
	}
}
