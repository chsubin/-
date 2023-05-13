class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int cnt=0;
		int cnt0=0;
		for(int i=0;i<lottos.length;i++) {
			for(int j=0;j<win_nums.length;j++) {
				if(lottos[i]==win_nums[j]) {
					cnt++;
				}
			}
			if(lottos[i]==0)cnt0++;
		}
		//최고순위구하기
		int max = 7-(cnt+ cnt0)>=6?6:7-(cnt+ cnt0);
		//최저순위 구하기
		int min = 7-cnt>=6?6:7-cnt;
		answer[0]=max;
		answer[1]=min;
        return answer;
    }
}