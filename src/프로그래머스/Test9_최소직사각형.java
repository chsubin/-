package 프로그래머스;
/*
명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다. 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서,
 작아서 들고 다니기 편한 지갑을 만들어야 합니다.
 이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.
아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.


*/
public class Test9_최소직사각형 {
	public static void main(String[] args) {
		int [][] sizes = {
				{60,50},
				{30,70},
				{60,30},
				{80,40}
		};
		int answer=0;
		
		int wmax = sizes[0][0]>sizes[0][1]?sizes[0][0]:sizes[0][1];
		int hmax = sizes[0][0]<sizes[0][1]?sizes[0][0]:sizes[0][1];
		for(int i=1;i<sizes.length;i++) {
			int temp=0;
			if(sizes[i][0]<sizes[i][1]){temp=sizes[i][0];sizes[i][0]=sizes[i][1];sizes[i][1]=temp;};
			if(wmax<=sizes[i][0]) wmax = sizes[i][0];
			if(hmax<=sizes[i][1]) hmax = sizes[i][1];
		}
		answer = wmax*hmax;
		answer = wmax*hmax;
		System.out.println(wmax +" "+hmax);
		System.out.println(answer);
	}
	
	
}
