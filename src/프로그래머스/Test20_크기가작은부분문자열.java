package 프로그래머스;

public class Test20_크기가작은부분문자열 {
	public static void main(String[] args) {
		String t = "500220839878";
		String p ="7";
		
		int answer=0;
		StringBuilder builder = new StringBuilder(t);
		
		for(int i=0;i<t.length()-p.length()+1;i++) {
		 String temp = builder.substring(i, i+p.length());
			if(temp.compareTo(p)<=0) answer++;
		}
		System.out.println(answer);
		
	}
}
