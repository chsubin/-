import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
		String s1 = "";
		String s2 = "";
		for(int i=0;i<str1.length();i++) {
			s1+= Character.toUpperCase(str1.charAt(i));
		}
		for(int i=0;i<str2.length();i++) {
			s2+= Character.toUpperCase(str2.charAt(i));
		}
		str1 = s1 ; str2 = s2; //교집합/합집합
		
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		HashMap<String, Integer> map3 = new HashMap<>();
		HashMap<String, Integer> map4 = new HashMap<>();
		for(int i=0;i<str1.length()-1;i++) {
			String gijun = str1.substring(i, i+2);
			if(!gijun.matches("^[A-Z]*$"))continue;
			map1.put(gijun, map1.getOrDefault(gijun, 0)+1);
		}
		for(int i=0;i<str2.length()-1;i++) {
			String gijun = str2.substring(i, i+2);
			if(!gijun.matches("^[A-Z]*$"))continue;
			map2.put(gijun, map2.getOrDefault(gijun, 0)+1);
		}
		Set<Map.Entry<String, Integer>> entry1 = map1.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator1 = entry1.iterator();
		Set<Map.Entry<String, Integer>> entry2 = map2.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator2 = entry2.iterator();
		while(entryIterator1.hasNext()) {//교집합구하기
			String key = entryIterator1.next().getKey();
			if(map2.containsKey(key)) {
				map4.put(key,map1.get(key)<map2.get(key)?map1.get(key):map2.get(key));
			}
			map3.put(key,map1.get(key));
		}
		while(entryIterator2.hasNext()) { //합집합구하기
			Map.Entry<String, Integer> entry = entryIterator2.next();
			String key = entry.getKey();
			int value= entry.getValue();
			if(!map3.containsKey(key)) {
				map3.put(key, value);continue;
			}
			map3.put(key, map3.get(key)>value?map3.get(key):value);
		}
		int gyo =0;
		int hop =0;
		for(int value : map3.values()) {
			hop+=value;
		}
		for(int value:map4.values()) {
			gyo+=value;
		}
		if(hop==0&&gyo==0) return 65536;
		int answer = 65536*gyo/hop;
        return answer;
    }
}