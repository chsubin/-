class Solution {
    boolean solution(String s) {
        boolean answer = true;
		int cnto = 0;
		int cntc = 0;
		for (int i=0;i<s.length();i++) {
			if(s.substring(i, i+1).equals(")")) {
				cntc++;
				if(i==0) {
					answer=false;
					break;
				}
			}
			if(s.substring(i, i+1).equals("(")) {
				cnto++;
				if(i==s.length()-1) {
					answer=false;
					break;
				}
			}
			if(cnto<cntc) {
				answer=false;
				break;
			}
		}
		if(cnto!=cntc) {
			answer=false;
		}
        return answer;
    }
}