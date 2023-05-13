import java.util.*;
class Solution {
    public String[] solution(String[] record) {
		HashMap<String, String> map = new HashMap<>();
		int changes =0;
		for(String sentence : record) {
			String [] words = sentence.split(" ");
			if(words[0].equals("Leave"))continue;
            if(words.length==2)continue;
			if(words[0].equals("Change")) changes++;
			map.put(words[1], words[2]);
		}
		String [] answer = new String [record.length-changes];
		int cnt=0;
		for(String a : record) {
			String [] words = a.split(" ");
			if(words[0].equals("Leave")) {
				answer[cnt] = map.get(words[1])+"님이 나갔습니다."; 
			}
			else if(words[0].equals("Change")) continue;
			else if(words[0].equals("Enter")){
				answer[cnt] = map.get(words[1])+"님이 들어왔습니다.";
			}
			cnt++;
		}
        return answer;
    }
}