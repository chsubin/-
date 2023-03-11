package 프로그래머스course2;

public class Test27_피로도2 {
	static int k = 80;
	static int [][] dungeons = {{80,20},{50,40},{30,10}};//필요체력/소모체력
	static int answer;
	static boolean[] isVisit;
	public static void main(String[] args) {
		isVisit = new boolean[dungeons.length];
		DFS(k , dungeons);
		System.out.println(answer);
	} 
	static void DFS(int k ,int [][] dungeons) {
		for(int i=0;i<dungeons.length;i++) {
			if(!isVisit[i]&&k >=dungeons[i][0]) {
				isVisit[i] = true;
				COUNT();
				DFS(k-dungeons[i][1],dungeons);
				isVisit[i] = false;
			}
		}
	}
	private static void COUNT() {
		int cnt =0;
		for(boolean a : isVisit) {
			if(a) cnt++; 
		}
		if(answer<cnt)answer = cnt;
	}
		
}
