package 프로그래머스course2_2;

import java.util.LinkedList;
import java.util.Queue;

public class Test6_스킬트리 {
	public static void main(String[] args) {
		String skill = "AC";
		String [] skill_trees = {"A", "CBADF", "AECB", "BDA"};
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
		System.out.println(answer);
		
		
		
		
	}
}
