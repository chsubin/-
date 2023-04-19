package 연습;

public class Test {
	public static void main(String[] args) {
		
		//조합
		dfs(0,5,0, new int[5]);
		
	}

	private static void dfs(int start, int limit, int idx, int[] result) {
		if(limit ==idx) { //5개를 모두 건드리면 출력
			for(int res : result) {
				System.out.print(res+" ");
			}
			System.out.println();
			return;
		}
		for(int i=start;i<10;i++) {
			result[idx] = i;
			dfs(i,limit,idx+1,result); //조합
		}
		
	}
}
