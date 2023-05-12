import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
    Set<Integer> numbers = new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			numbers.add(nums[i]);
		}
		if((nums.length/2)>numbers.size()) answer =numbers.size();
		else answer = nums.length/2;
        
        return answer;
    }
}