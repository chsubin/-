class Solution {
    public int[] solution(int n, long left, long right) {
		int [] answer = new int [(int)(right-left+1)];
		
		long cnt =(left/n)*n-1;
		for(int i=(int)(left/n)+1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				cnt ++;
				if(cnt>right) break;
				else if(cnt<left) continue;
				answer[(int)(cnt-left)]= i>=j?(int)i:(int)j;;
			}
		}
        return answer;
    }
}