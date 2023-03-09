package 프로그래머스course2;

public class Test20_n2배열자르기 {
	public static void main(String[] args) {
		int n = 4;
		long left = 7;
		long right = 14;
		int [] answer = new int [(int)(right-left+1)];
		
		long cnt =(left/n)*n-1;
		for(int i=(int)(left/n)+1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				cnt ++;
				if(cnt>right) break;
				else if(cnt<left) continue;
				answer[(int)(cnt-left)]= i>=j?(int)i:(int)j;;
			}
		}
		
		for(int i=0;i<answer.length;i++) {
			System.out.println("답 : "+answer[i]);
		}
		
		
		
	}
}
