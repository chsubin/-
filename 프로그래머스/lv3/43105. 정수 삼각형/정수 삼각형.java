class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
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
        answer = triangle[0][0];
        
        return answer;
    }
}