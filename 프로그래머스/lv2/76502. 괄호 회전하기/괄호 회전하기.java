import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
		for(int j=0;j<s.length();j++) {
			int sw =1;
			
			s= s.substring(1,s.length())+ s.substring(0, 1);
			
			Stack<String> stack = new Stack<>();
			String bigyo="";
			for(int i=0;i<s.length();i++) {
				if(s.substring(i,i+1).equals("[")||s.substring(i,i+1).equals("(")||s.substring(i,i+1).equals("{")) {
					stack.push(s.substring(i,i+1));
					continue;
				}
				else if(stack.isEmpty()) {sw=0;break;}
				bigyo = stack.pop();
				if(s.substring(i, i+1).equals(bigyo)) {
					sw=0; 
					break;
				}
				if(s.substring(i, i+1).equals("]")) {
					if(bigyo.equals("[")) {
					}
					else {
						sw=0;
						break;
					}
				}
				else if(s.substring(i, i+1).equals("}")) {
					if(bigyo.equals("{")) {
					}
					else {
						sw=0;
						break;
					}
					
				}
				else if(s.substring(i, i+1).equals(")")) {
					if(bigyo.equals("(")) {
					}
					else {
						sw=0;
						break;
					}
				}
			}
			if(sw==1&&stack.isEmpty()) {
				answer ++;
				continue;
			}
		}
        
        return answer;
    }
}