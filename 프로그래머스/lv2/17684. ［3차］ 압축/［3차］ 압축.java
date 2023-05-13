import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class Solution {
    public int[] solution(String msg) {
		HashMap<String, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for(int i=65;i<91;i++) {
			map.put(String.valueOf(Character.toChars(i)) , i-64);
		}
		for(int i=0;i<=msg.length();i++) {
			for(int j=msg.length();j>i;j--) {
				String word = msg.substring(i,j);
				if(map.containsKey(word)) {
					list.add(map.get(word));
					if(j+1<=msg.length()) {
						map.put(msg.substring(i,j+1),map.size()+1);
					}
					i+= word.length()-1;
					break;
				}
			}
		}	
		int [] answer = new int [list.size()];
		for(int i=0;i<answer.length ;i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }
}