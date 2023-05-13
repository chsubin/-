class Solution {
	static String target;
	static int count =0;
    static int answer =0;
	static char A[]= {'A','E','I','O','U'};
    public int solution(String word) {
		target = word;
		
		for(int i=0;i<A.length;i++) {
			DFS(i,0,A[i]+"");
		}
		return answer;

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