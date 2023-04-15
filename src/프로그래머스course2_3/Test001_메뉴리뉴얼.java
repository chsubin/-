package 프로그래머스course2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test001_메뉴리뉴얼 {
	static ArrayList<Character> food;
	static ArrayList<String> strs;
	static boolean [] visit;
	static String order[];
	static int target;
	static int max=0;
	public static void main(String[] args) {
		String [] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};//단품메뉴 조합
		order = orders;
		int [] course = {2,3,4}; //코스요리메뉴개수
		//최소 두명 이상의손님에게서 골라진 요리만 추가
		
		//2,3,4개의 요리를 골라서 두명이상의 손님에게서 골라졌는지 확인하기. arraylist?
		food = new ArrayList<>(); //메뉴의 전체 개수
		strs = new ArrayList<>();

		for(int i=0;i<orders.length;i++) {
			for(int j=0;j<orders[i].length();j++) {
				if(!food.contains(orders[i].charAt(j))) {
					food.add(orders[i].charAt(j));
				}
			}
		}
		Collections.sort(food);
		ArrayList<String> arr = new ArrayList<>();
		
		for(int k=0;k<course.length;k++) {
			strs = new ArrayList<>();
			max = 0;
			visit = new boolean [food.size()];
			target = course[k];
			for(int i=0;i<food.size();i++) {
				DFS(i,food.get(i)+"");
			}
			for(String s:strs) {
				arr.add(s);
			}
		}
		String [] answer = new String[arr.size()];
		for(int i=0;i<arr.size();i++) {
			answer[i] = arr.get(i);
		}
		Arrays.sort(answer);
		
	}
	private static void DFS(int index, String str) {
		if(visit[index]) return;
		visit[index] = true;
		if(str.length()==target) {
			int num=0;
			for(int i=0;i<order.length;i++) {
				int sw =1;
				for(int j=0;j<str.length();j++) {
					if(!order[i].contains(str.substring(j, j+1))) {//포함하지 않았을경우
						sw= 0;
						break;
					}
				}
				if (sw ==1)num++;
			}
			if(max<num&&num>1) {max = num;strs = new ArrayList<>();strs.add(str);}
			else if(max==num&&num>1) {
				strs.add(str);
			}
			return;
		} //2개이상의 주문이 포함하고 있는지를 봐야함
		for(int i=index+1;i<food.size();i++) {
			if(!visit[i]) {
				DFS(i,str+food.get(i));
				visit[i] = false;
			}
		}
		
	}
}
