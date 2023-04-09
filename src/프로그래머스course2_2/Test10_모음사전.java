package 프로그래머스course2_2;

public class Test10_모음사전 {
	static String target;
	static int count =0;
	static int answer =0;
	static char A[]= {'A','E','I','O','U'};
	public static void main(String[] args) {
		String word = "AAAAE";
		target = word;
		
		for(int i=0;i<A.length;i++) {
			DFS(i,0,A[i]+"");
		}
		
		
		System.out.println(answer);
	}

	private static void DFS(int su, int depth,String str) {
		if(depth>=5)return;
		count++;
		if(target.equals(str)) {
			System.out.println(str);
			answer=count;
		}
		for(int i=0;i<A.length;i++) {
			DFS(i,depth+1,str+A[i]);
		}
	}
}
