package 프로그래머스course_2;

import java.util.Arrays;

public class Test2_더맵게2 {
	static int cnt=0;
	static int answer =0;
	public static void main(String[] args) {
		int [] scoville = {1,1,1,1};
		cnt = 30;
		
		solution(scoville);
		
		System.out.println(answer);
		
	}
	private static void solution(int[] scoville) {
		
		for(int i=1;i<scoville.length;i++) { //index 0을 제외한 모든원소를 자식노드로 만들어 반복하여 실행한다.
			int c = i; //i는 자식노드(c)와 같이간다.
			do {   //root 부모노드 ,c= 자식 노드
				int root=(c-1)/2; //자식노드로 부모노드를 구한다.
				if(scoville[root]<scoville[c]) {
					int temp=scoville[root];scoville[root]=scoville[c];scoville[c]=temp;
				}
				c=root;  
			}while(c!=0); 
		}
		for(int i= scoville.length-1;i>=0;i--) {
			int temp = scoville[0];scoville[0]=scoville[i];scoville[i]=temp; //맨끝의 인덱스[i]와 위의 인덱스를 바꾼다 제일 큰 값을 찾아 뒤로보내는 구조.
			int root = 0;
			int c;
			do {
				c=2*root+1; 
				if(c>=i)break;
				if(c<i-1) { 
					if(scoville[c]<scoville[c+1])c++;
				}
				if(scoville[root]<scoville[c])temp = scoville[root];scoville[root]=scoville[c];scoville[c]=temp;
				root =c; 
			}
			while(c<i);
			}
		
		
		
		int min =0;
		for(int i=0;i<scoville.length;i++) {
			if(scoville[i]!=0) {min= i;break;}
		}
		if(scoville[min]>=cnt) return;
		else {
			if((min+1)>=scoville.length) {answer=-1; return;}
			scoville[min] =scoville[min]+(scoville[min+1]*2);
			scoville[min+1]=0;
			answer++;
			solution(scoville);
		}
	}
}
