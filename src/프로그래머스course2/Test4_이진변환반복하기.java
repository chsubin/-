package 프로그래머스course2;

public class Test4_이진변환반복하기 {
	public static void main(String[] args) {
		String s ="01110";
		int cnt2=0;
		int cnt=0;
		while(!s.equals("1")) {
			for(int i=0;i<s.length();i++) {
				if(s.substring(i, i+1).equals("0")) {
					cnt++;
					System.out.println("cnt : "+cnt);
					}
			}
			s= s.replace("0", "");
			int temp = s.length();
			s =Integer.toBinaryString(temp);
			System.out.println(s);
			
			cnt2++;
		}
		
		
		System.out.println(cnt2);
		System.out.println(cnt);
	}
}
