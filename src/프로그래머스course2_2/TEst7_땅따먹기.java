package 프로그래머스course2_2;

public class TEst7_땅따먹기 {
	public static void main(String[] args) {
		int [][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		int answer=0;
		
		int su =-1;
		for(int i=0;i<land.length;i++) {
			int max = 0;
			int a = su;
			for(int j=0;j<land[0].length;j++) {
				System.out.println("su: "+su);
				if(su!=-1&&su==j)continue;
				if(max<land[i][j]) {max = land[i][j];a=j;}
			}
			su = a;
			System.out.println("max : "+max);
			answer+=max;
		
		}
		
		System.out.println(answer);
	}
}
