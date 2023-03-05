package 프로그래머스course2;

public class Test16_행렬의곱셈 {
	public static void main(String[] args) {
		int [][] arr1 = {{1,4},
											{3,2},
											{4,1}
											};
		int [][] arr2 = {{3,3},
										 {3,3}
		};
		
		int answer [][] = new int [arr1.length][arr2[0].length];
		
		for(int k=0;k<arr1.length;k++) {
			for(int l=0;l<arr2[0].length;l++) {
				for(int i=0;i<arr1[0].length;i++) {
						answer[k][l] += arr1[k][i]*arr2[i][l];
				}
				System.out.println("arr["+k+"]["+l+"] = "+answer[k][l]);
			}
		}
		
	}
}
