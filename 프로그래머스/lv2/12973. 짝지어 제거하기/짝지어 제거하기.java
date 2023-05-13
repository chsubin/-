import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 1;

		StringBuilder builder = new StringBuilder();
		builder.append(s.substring(0, 1));
		for(int i=1;i<s.length();i++) {
			if(builder.length()!=0&&builder.substring(builder.length()-1).equals(s.substring(i, i+1))) {
				builder.delete(builder.length()-1,builder.length());
			}
			else {
				builder.append(s.subSequence(i, i+1));
			}
		}
		if(builder.length()!=0) {answer=0;}

        return answer;
    }
}