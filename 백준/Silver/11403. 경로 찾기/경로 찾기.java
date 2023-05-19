import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [][] pro = new int [n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=1;j<=n;j++) {
				pro[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(pro[i][k]==1&&pro[k][j]==1) {
						pro[i][j] = 1;
					}
					
				}
			}
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(pro[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}
}
