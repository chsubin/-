import java.util.*; 
class Solution {
    public int[] solution(String s) {
		s= s.replace("{", "").replace("}", "");
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			String a = s.substring(i);
			if(a.indexOf(",")==0)continue;
			if(a.indexOf(",")!=-1) {
				i+= a.indexOf(",");
				a = a.substring(0, a.indexOf(","));
			}
			else {
				i=s.length();
			}
			map.put(Integer.parseInt(a) ,map.getOrDefault(Integer.parseInt(a), 0)+1 );
			
		}
		
		int [] key = new int [map.size()]; 
		int [] value = new int [map.size()];
		
		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> entryIterator = entrySet.iterator();
		int cnt =0;
		while(entryIterator.hasNext()) {
			Map.Entry<Integer, Integer> entry = entryIterator.next();
			key[cnt]= entry.getKey();
			value[cnt] = entry.getValue();
			cnt++;
		}
		for(int i=0;i<key.length;i++) { //내림차순정렬
			for(int j=i+1;j<key.length;j++) {
				int temp =0;
				if(value[j]>value[i]) {
					temp = key[i];key[i]=key[j];key[j]=temp;
					temp = value[i];value[i]=value[j];value[j]=temp;
				}
			}
		}
		int [] answer = key;
        return answer;
    }
}