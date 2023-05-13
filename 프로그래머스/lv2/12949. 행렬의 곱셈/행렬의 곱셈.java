class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
		int answer [][] = new int [arr1.length][arr2[0].length];
		
		for(int k=0;k<arr1.length;k++) {
			for(int l=0;l<arr2[0].length;l++) {
				for(int i=0;i<arr1[0].length;i++) {
						answer[k][l] += arr1[k][i]*arr2[i][l];
				}
				//System.out.println("arr["+k+"]["+l+"] = "+answer[k][l]);
			}
		}
        return answer;
    }
}