package 프로그래머스course2_2;

public class Test028_체육대회 {
	static boolean visit [];
	static int A [][];
	static int answer;
	public static void main(String[] args) {
		int [][] ability = {
				{40,10,10},
				{20,5,0},
				{30,30,30},
				{70,0,70},
				{100,100,100},
				};
		A = ability;
		visit = new boolean[A.length];
		int n = A[0].length; //골라야하는 종목수
		int m = A.length;//학생수
		for(int i=0;i<m;i++) {
			DFS(i,0,A[i][0]); //첫번째 종목
			visit = new boolean[A.length];
		}
		System.out.println(answer);
		
		
	}
	private static void DFS(int now, int su,int jumsu) {
		visit[now] = true;
		if(su==A[0].length-1) {
			if(answer<jumsu) {
				answer= jumsu;
			}
			return;
		}
		for(int i=0;i<A.length;i++) {
			if(!visit[i]) {
				visit[i] = true;
				DFS(i,su+1,jumsu+A[i][su+1]);
				visit[i]= false;
			}
		}
	}
		
}
