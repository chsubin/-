class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 1;
        int b = 2;
        int c = 0;
        for(int i=3;i<=n;i++){
            c = (a+b)%1000000007;
            a = b;
            b = c;
        }
        return c;
    }
}