class Solution {
    public int solution(int n) {
        int answer = n;
        while(true) {
			answer++;
			if(Integer.bitCount(answer)==Integer.bitCount(n)) break;
		}
        return answer;
    }
}