import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
		int answer =0;
		
		ArrayList<Integer> que= new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> center = new ArrayList<>();
		for(int i=0;i<priorities.length;i++) {
			que.add(priorities[i]);
			list.add(i);
		}
		que.get(0);
		int sw =0;
		while(que.size()!=0) {
			for(int i=1;i<que.size();i++) {
				sw=0;
				if(que.get(0)<que.get(i)) {
					que.add(que.get(0));
					list.add(list.get(0));
					que.remove(0);
					list.remove(0);
					sw=1;
					break;
				}
			}
			if(sw==0) {
				center.add(list.get(0));
				que.remove(0);list.remove(0);
			}
		}
		for(int i=0;i<center.size();i++) {
			if(location==center.get(i)) {
				answer = i+1;
				break;
			}
		}
        return answer;
    }
}