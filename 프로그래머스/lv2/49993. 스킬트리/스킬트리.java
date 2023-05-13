import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
		int answer =0;
		
		for(int j=0;j<skill_trees.length;j++) {
			Queue<String> que = new LinkedList<>();
			for(int i=0;i<skill.length();i++) {
				que.add(skill.substring(i,i+1));
			}
			int sw =0;
			for(int i=0;i<skill_trees[j].length();i++) {
				if(que.contains(skill_trees[j].substring(i,i+1))) {
					String a = que.poll();
					if(a.equals(skill_trees[j].substring(i,i+1))){
						continue;
					}
					else {
						sw =1;
						break;
					}
				}
			}
			if(sw==0) answer++;
		}
        return answer;
    }
}