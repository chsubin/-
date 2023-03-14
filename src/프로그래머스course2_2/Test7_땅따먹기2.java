package 프로그래머스course2_2;

import java.util.TreeSet;

public class Test7_땅따먹기2 {
	static TreeSet<Integer> set = new TreeSet<>();
	public static void main(String[] args) {
		int [][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		int answer=0;
		
		for(int i=0;i<land[0].length;i++) {
			getTree(0,i,land[0][i],land);
		}
		
		answer = set.last();
		
		System.out.println(answer);
	}
	private static void getTree(int row, int col,int degree, int[][] land) {
		row++;
		if(row == land.length) {
			set.add(degree);
			return;
		}
		for(int i=0;i<land[0].length;i++) {
			if(i==col)continue;
			getTree(row,i, degree+land[row][i], land);
		}
	}
}
