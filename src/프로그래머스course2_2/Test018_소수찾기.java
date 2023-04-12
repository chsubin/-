package 프로그래머스course2_2;

import java.util.ArrayList;

public class Test018_소수찾기 {
	static int [] arr;
	static boolean [] visited;
	static String nums [];
	static int answer =0;
	public static void main(String[] args) {
		String numbers = "011";
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
		System.out.println(answer);
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
