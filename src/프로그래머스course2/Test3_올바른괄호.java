package 프로그래머스course2;

public class Test3_올바른괄호 {
	public static void main(String[] args) {
		boolean answer = true;
		String s = "())))()()()()()()(";
		
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
		System.out.println(answer);
	}
}
