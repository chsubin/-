class Solution {
    static int answer;
    public int solution(int[] numbers, int target) {
		
		answer =0;
		DFS(numbers,target,0);
		return answer;
	}
	static void DFS(int []numbers, int target, int L) {
		if(L==numbers.length) {
			int sum =0;
			for(int x :numbers) sum+=x;
			if(sum==target) answer++;
		}
		else {
			DFS(numbers,target,L+1);
			numbers[L] =numbers[L]*-1;
			DFS(numbers,target,L+1);
			
		}
	}
}