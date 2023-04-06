package doit알고리즘;

import java.util.*;
import java.io.*;


public class Test_문자열찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		tNode root= new tNode(); //부모노드
		
		while(n>0) { //S에 트리저장하기
			String text = sc.next();
			tNode now = root;//now는 현재노드를 의미한다.
			for(int i=0;i<text.length();i++) {
				char c = text.charAt(i);
				if(now.next[c-'a']==null) {//다음노드가 없으면 다음노드를 넣어준다.
					now.next[c-'a'] = new tNode();
				}
				now = now.next[c-'a'];
				if(i==text.length()-1)now.isEnd = true;
			}
			n--;
		}
		int count = 0;
		while(m>0) { //S에 속해있는지 확인
			String text = sc.next();
			tNode now = root; //root부터 시작하기
			for(int i=0;i<text.length();i++) {
				char c = text.charAt(i);
				if(now.next[c-'a']==null) {
					break;
				}
				now = now.next[c-'a'];
				if(i==text.length()-1&&now.isEnd) count++;
			}
			m--;
		}
		System.out.println(count);
	}
	
}
class tNode{
	tNode[] next = new tNode[26]; //다음노드를 넣어주기
	boolean isEnd ;
	
	
}
