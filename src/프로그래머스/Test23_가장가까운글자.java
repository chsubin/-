package 프로그래머스;

public class Test23_가장가까운글자 {
	public static void main(String[] args) {
		String s = "banana";
		int [] answer = new int[s.length()];
		
		
		
		for(int i=0;i<s.length();i++) {
			String temp =s.substring(i,i+1);
			String temp2 = s.substring(0,i);
			System.out.println(temp2);
			if(temp2.lastIndexOf(temp)!=-1) {
				answer[i]=i-temp2.lastIndexOf(temp);
			}
			else answer[i]=-1;
			
			System.out.println(answer[i]);
		}
		
		
	}
}
