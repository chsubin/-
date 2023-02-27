package 프로그래머스course3;

public class Test1_동적프로그래밍 {
	public static void main(String[] args) {
		
		int [][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4,},{4,5,2,6,5}};
 		int  len = triangle.length;
 		
 		for(int j=len-1;j>=0;j--) {
	 		for(int i=0;i<j;i++) {
 			
	 			if(triangle[j][i]>triangle[j][i+1]) {
	 				triangle[j-1][i] =triangle[j-1][i]+triangle[j][i];
	 			}
	 			else {
	 				triangle[j-1][i] =triangle[j-1][i]+triangle[j][i+1];
	 			}
 		}
 	}
 		
		
	}
		
		
}
