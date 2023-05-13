class Solution {
    public int solution(int n) {
		int a = 1;
		int b = 2;
		int c = 0;
		
		for(int i=3;i<=n;i++) {
			c = (a + b)%1000000007;
			int temp;
			 a = b ;b=c ;
		}
        return c;
    }
}