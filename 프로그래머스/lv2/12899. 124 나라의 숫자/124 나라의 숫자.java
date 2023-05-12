class Solution {
	static int A [] = {1,2,4};
    public String solution(int n) {
        return 	FIND(n).toString();
    }
	private static StringBuilder FIND(int n) {
		int a = (n-1)/3-1;
		int b = (n-1)%3;
		StringBuilder sb = new StringBuilder(); 
		if(a<0) {
			sb.append(A[b]);
		}
		else if (a<3){
			sb.append(A[a]);
			sb.append(A[b]);
		}
		else {
			sb.append(FIND(a+1));
			sb.append(A[b]);
		}
		return  sb;
	}
}