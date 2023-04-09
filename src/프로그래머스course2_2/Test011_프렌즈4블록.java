package 프로그래머스course2_2;

import java.util.LinkedList;
import java.util.Queue;

public class Test011_프렌즈4블록 {
	public static void main(String[] args) {
		int m = 4 ;
		int n = 5 ;
		String [] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
		int answer=0;
		
		String [][] A = new String [m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				A[i][j] = board[i].substring(j,j+1);
			}
		}//2차원배열로 만들었다.
		Queue<int[]> list = new LinkedList<>();
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int i=0;i<m-1;i++) {
				for(int j=0;j<n-1;j++) {
					String a = A[i][j];
					if(!a.equals("")&&A[i][j+1].equals(a)&&A[i+1][j].equals(a)&&A[i+1][j+1].equals(a)) {
						list.add(new int []{i,j});
						list.add(new int []{i,j+1});
						list.add(new int []{i+1,j});
						list.add(new int []{i+1,j+1});
						flag = true;
					}
				}
			}
			while(!list.isEmpty()) {
				int arr[] = list.poll();
				if(!A[arr[0]][arr[1]].equals(""))
				answer++;
				A[arr[0]][arr[1]] = "";//맞는거 없애주기
			}
			for(int j=n-1;j>=0;j--) {
				Queue<String> queue = new LinkedList<>();
				for(int i=m-1;i>=0;i--) {
					String a = A[i][j];
					if(!a.equals("")) {
						queue.add(A[i][j]);
					}
				}
				for(int i=m-1;i>=0;i--) {
					if(!queue.isEmpty()) {
						A[i][j] = queue.poll();
					}
					else {
						A[i][j] ="";
					}
				}
			}
		}
		System.out.println(answer);
	}
}
