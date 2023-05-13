class Solution {
    static int [] arr;
	static boolean [] visited;
	static String nums [];
	static int answer =0;
    public int solution(String numbers) {
		nums = numbers.split("");
		arr = new int [10000000];
		visited  = new boolean[nums.length];
		
		for(int i=2;i<arr.length;i++) {
			arr[i] = i;
		}
		for(int i=2;i<=Math.sqrt(arr.length);i++) {
			if(arr[i]!=0) {
				for(int j=i+i;j<arr.length;j+=i) {
					arr[j] = 0;
				}
			}
		}
		for(int i=0;i<nums.length;i++) {
			DFS(i,"");
		}
        return answer;
    }
	private static void DFS(int index,String str) {
		if(visited[index]) return;
		visited[index] = true;
		str+=nums[index];
		if(arr[Integer.parseInt(str)]!=0) {
			arr[Integer.parseInt(str)]=0;
			answer ++;
		}
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				DFS(i,str);
			}
		}
		visited[index]= false;
	}
}