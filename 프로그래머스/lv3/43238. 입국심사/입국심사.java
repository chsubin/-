class Solution {
    public long solution(int n, int[] times) {
    long answer = 0;
    long max = (long) times[0];
    long min = (long) times[0];
    
    for(int i=0;i<times.length;i++){
        if(max<times[i]) max = times[i];
        if(min>times[i]) min = times[i];
    }
    long start = min;
    long end = (n/times.length+1)*max;
    while(start<=end) {
    	long mid = (start+end)/2;
    	long sum = 0;
    	for(int i=0;i<times.length;i++) {
    		sum +=mid/times[i];
    	}
    	if(sum>=n) {
    		end = mid-1;
    	}
    	if(sum<n) {
    		start = mid +1;
    	}
    }
        
        return start;
    }
}