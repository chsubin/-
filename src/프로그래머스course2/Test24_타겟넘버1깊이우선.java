package 프로그래머스course2;

public class Test24_타겟넘버1깊이우선 {
	static int answer;
	public static void main(String[] args) {
		
		int [] numbers= {4,1,2,1};
		int target = 4;
		
		answer =0;
		DFS(numbers,target,0);
		System.out.println(answer);
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
