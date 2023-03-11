package 프로그래머스course2;

public class Test27_피로도 {
	static int k = 80;
	static int [][] dungeons = {{80,20},{50,40},{30,10}};//필요체력/소모체력
	static int answer;
	static boolean[] isVisit;
	public static void main(String[] args) {
		isVisit = new boolean[dungeons.length];
		System.out.println(go(k,dungeons));
	} 
	static int go(int k, int [][] arr) {
		int ans =0;
		
		for(int i=0;i<arr.length;i++) { //반복문을돌린다.
			if(!isVisit[i]&&k>=arr[i][0]) {//방문하지 않고, 던전 최소 피로도를 만족한 경우
				isVisit[i]=true; //방문한것으로 바꾸어준다.
				ans = Math.max(ans, go(k-arr[i][1],arr));
				isVisit[i]=false; //다시 방문하지 않은것으로 만둘어준다. -->계속 이행하기 위해서
			}
		}
		return Math.max(ans, adventure(isVisit));
	}
	static int adventure(boolean[] isVisit) {//방문한 노드의 개수를읽어준다.
		int count =0;
		for(boolean v: isVisit) {
			if(v) count ++;
		}
		return count;
		
		
		
	}
	
	
	
	
	
}
