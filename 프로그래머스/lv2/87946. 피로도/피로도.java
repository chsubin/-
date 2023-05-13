class Solution {
    static int answer=-1;
    static boolean[] isVisit;
    public int solution(int k, int[][] dungeons) {
		isVisit = new boolean[dungeons.length];
		DFS(k , dungeons);
		return answer;
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