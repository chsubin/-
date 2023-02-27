package 프로그래머스;

import java.util.*;

/*
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

*/
public class Test18_소수만들기 {
	public static void main(String[] args) {
		int nums[] = {8,5,3,2,1,9,10};
		
		
		ArrayList<Integer> num = new ArrayList<>();
		for(int i=0;i<nums.length-2;i++) {
			for(int j=i+1;j<nums.length-1;j++) {
				for(int k=j+1;k<nums.length;k++) {
					num.add(nums[i]+nums[j]+nums[k]);
					System.out.println(i+""+j+""+k);
					System.out.println(nums[i]+nums[j]+nums[k]);
				}
			}
		}
		System.out.println(num);
		int cnt=0;
		for(int number : num) {
			int sw=0;
			for(int i=2;i<=number-1;i++) {
				if(number%i==0) {
					sw=1;
				}
			}
			if(sw==0) {cnt++;System.out.println(number+"dkdkd");};
		}
		
		
		int answer =cnt;
		
		
		
		System.out.println(answer);
	}
}
