package 프로그래머스;

import java.util.Arrays;

/*
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ... (5주기)
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...(주기: 8)
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...(주기:10)
*/
public class Test17_모의고사 {
	public static void main(String[] args) {
		int [] answers = {1,3,2,4,2,3,4,2,1,4,5};
		int [] answer;
		
		int [] arr1 = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		int [] arr2 = {2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5};
		int [] arr3 = {3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5};
		
		int len = answers.length;
		int [] jumsu = {0,0,0};
		int [] rank = {1,1,1};
		
		int cnt=0;
		for(int i=0;i<len;i++) {
			if(cnt==40)cnt=0;
			if(arr1[cnt]==answers[i])jumsu[0]++;
			if(arr2[cnt]==answers[i])jumsu[1]++;
			if(arr3[cnt]==answers[i])jumsu[2]++;
			cnt++;
		}
		for(int i=0;i<2;i++) {
			for(int j=i+1;j<3;j++) {
				if(jumsu[i]>jumsu[j])rank[j]++;
				if(jumsu[i]<jumsu[j])rank[i]++;
			}
		}
		int cnt2=0;
		for(int i=0;i<3;i++) {
			if(rank[i]==1)cnt2++;
		}
		answer = new int [cnt2];
		int j=0;
		for(int i=0;i<3;i++) {
			if(rank[i]==1){answer[j]=i+1;j++;}
		}
		for(int i=0;i<3;i++) {
			System.out.println(answer[i]);
		}
	}

		
}
