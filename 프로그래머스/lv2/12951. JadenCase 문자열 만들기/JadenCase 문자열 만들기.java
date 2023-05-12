class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder builder = new StringBuilder();
		
		int sw=0;
		for(int i=0;i<s.length();i++) {
			char a =s.charAt(i);
			if(i==0||(sw==1&&a>10)) {
				builder.append(Character.toUpperCase(a));
			}
			else if(sw==1&&a<10) {
				builder.append(a);
			}
			else {
				builder.append(Character.toLowerCase(a));
			}
			sw=0;
			if(a==' ') {
				sw=1;
			}
		}
        answer = String.valueOf(builder);
        return answer;
    }
}