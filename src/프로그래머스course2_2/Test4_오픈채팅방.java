package 프로그래머스course2_2;

import java.util.HashMap;

public class Test4_오픈채팅방 {
	public static void main(String[] args) {
		String [] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan","Leave uid4567"};
		
		HashMap<String, String> map = new HashMap<>();
		int changes =0;
		for(String sentence : record) {
			String [] words = sentence.split(" ");
			if(words[0].equals("Leave"))continue;
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
		for(String a : answer) {
			System.out.println(a);
		}
		
	}
}
