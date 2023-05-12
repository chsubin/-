class Solution {
    public int[] solution(String s) {
		int cnt2=0;
		int cnt=0;
		while(!s.equals("1")) {
			for(int i=0;i<s.length();i++) {
				if(s.substring(i, i+1).equals("0")) {
					cnt++;
					}
			}
			s= s.replace("0", "");
			int temp = s.length();
			s =Integer.toBinaryString(temp);
			System.out.println(s);
			
			cnt2++;
		}
        int [] answer={cnt2,cnt};
        return answer;
    }
}