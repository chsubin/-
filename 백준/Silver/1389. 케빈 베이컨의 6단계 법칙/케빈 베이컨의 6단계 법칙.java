import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int [][] distance = new int [n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) distance[i][j] = 0;
				else distance[i][j] = 10000001;
			}
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			distance[S][E] = 1;
			distance[E][S] = 1;
		}
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(distance[i][j]>distance[i][k]+distance[k][j])
						distance[i][j] = distance[i][k]+distance[k][j];
				}
			}
		}
		int answer = 10000001;
		int index = 0;
		for(int i=1;i<=n;i++) {
			int sum = 0;
			for(int j=1;j<=n;j++) {
				if(i!=j) {
					sum += distance[i][j];
				}
			}
			if(answer>sum) {
				answer = sum;
				index = i;
			}
		}
		
		System.out.println(index);
		
	}
}
