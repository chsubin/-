class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int [] arr = {31,29,31,30,31,30,31,31,30,31,30,31};
		int days = 0;
		for(int i=0;i<a-1;i++) {
			days+=arr[i];
		}
		days+=b;
		String [] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        answer = day[days%7];
        return answer;
    }
}