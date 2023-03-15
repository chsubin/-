package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test004_구간합2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bs.readLine());

 		int row= Integer.parseInt(st.nextToken());
 		int answer = Integer.parseInt(st.nextToken());
 		
 		int [][] arr = new int [row+1][row+1];
 		int [][] d = new int [row+1][row+1];
 		
 		for(int i=1;i<row+1;i++) {
 			st = new StringTokenizer(bs.readLine());
 			for(int j=1;j<row+1;j++) {
 				arr[i][j] = Integer.parseInt(st.nextToken());
 			}
 		}
 		for(int i=1;i<row+1;i++) {
 			for(int j=1;j<row+1;j++) {
 				d[i][j] = d[i][j-1] +d[i-1][j] -d[i-1][j-1] +arr[i][j];
 			}
 		}
		for(int i=0;i<answer;i++) {
			st = new StringTokenizer(bs.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int result = d[x2][y2]-d[x1-1][y2] -d[x2][y1-1] +d[x1-1][y1-1];
			System.out.println(result);
		}
		
	}
}
