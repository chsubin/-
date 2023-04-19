package 프로그래머스course2_3;

public class Test_양궁대회 {
	static int max ;
	static int [] answer;
	public static void main(String[] args) {
		answer = new int [11]; 
		int n = 5;//화살개수
		int [] info = {2,1,1,1,0,0,0,0,0,0,0};
		
		dfs(0,n,0,new int [n],info);
		//라이언의 가장 작은 점수,화살개수, 현재 화살개수, , 어피치 점수
		
	}
	private static void dfs(int start, int r, int idx, int[] result, int[] info) {
		if(idx == r) {  //result 배열을 다 건드렸을 경우
			int [] info2 = new int [11];
			//과녁 점수를 어피치와 같이 과녁점수 맞춘 개수로 표현
			for(int score:result) {
				info2[10-score]++; //라이언 점수
			}
			int ryan = 0;
			int apeach =0;
			
			for(int i=0;i<11;i++) {
				//info[0] = 10점, info[1] = 9점 맞추기위해 score계산
				int score = 10-i;
				//라이언이 이긴경우
				if(info2[i]>info[i]) {
					ryan += score;
				}
				//어피치가 이긴경우
				else if(info2[i]<info[i]) {
					apeach += score;
				}
				//과녁에 맞추고 어피치와 라이언이 같은 개수를 쏜 경우
				else if(info[i]!=0&&info[2] ==info[i]) {
					apeach += score;
				}
			}
			if(ryan-apeach>max) { //라이언과 어피치의 점수차이가 클때 answer 에 저장해준다.
				max = ryan-apeach;
				answer = info2;
			}
			return;
		}
		//현재 화살개수
		for(int i=start;i<11;i++) { //조합!! 00000,00001,00011,
			//라이언이 쏜 과녁점수 저장
			result[idx] = i;
			dfs(i,r,idx+1,result,info);
		}
	}
}