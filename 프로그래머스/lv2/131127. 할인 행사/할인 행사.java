import java.util.HashMap;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
		int answer =0;
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0;i<=discount.length-10;i++) {
			int sw=0;
			for(int j=0;j<10;j++) {
				map.put(discount[i+j], map.getOrDefault(discount[i+j], 0)+1); //할인하는날 먼저 처리
			}
			for(int k=0;k<want.length;k++) { //장바구니 반복문돌기
				if(map.containsKey(want[k])) { //장바구니 안에 있는것이 할인할때
					if(map.get(want[k])!=number[k]) {
						sw=1;
						break;
					}
				}
				else { //할인하지않을떄
					sw=1;
					break;
				}
			}
			if(sw==0)answer ++;
			map.clear();
		}
        return answer;
    }
}