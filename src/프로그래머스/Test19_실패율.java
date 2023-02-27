package 프로그래머스;

import java.util.Arrays;

/*
전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 
담긴 배열 stages가 매개변수로 주어질 때, 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 
담겨있는 배열을 return 하도록 solution 함수를 완성하라.


*/
public class Test19_실패율 {
	public static void main(String[] args) {
		int N = 4;
		int [] stages = {4,4,4,4};
		int [] answer = new int [N];
		
		//스테이지 별 성공자 , 도전자 구해야함.(성공자)(실패자)
		int [][] result = new int [N][2];
		double [] per = new double [N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<stages.length;j++) {
				if(i+1<stages[j]) {
					result[i][0]++;
				}
				else if(i+1==stages[j]) {
					result[i][1]++;
				}
			}
		}
		for(int i=0;i<N;i++) {
			per[i]= (double)result[i][1]/(result[i][1]+result[i][0]);
			answer[i]=i+1;
			System.out.println(per[i]);
		}
		//버블소트 사용!!!!
		for(int i=1;i<N;i++) {
			for(int j=0;j<N-i;j++) {
				if(per[j]<per[j+1]) {
					double temp=per[j];per[j]=per[j+1];per[j+1]=temp;
					int temps = answer[j];answer[j]=answer[j+1];answer[j+1]=temps;
				}
			}
		}
		for(int i=0;i<N;i++) {
			System.out.println(answer[i]);
		}
	}
}
