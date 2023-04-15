package 프로그래머스course2_3;

public class Test002_두큐합같게만들기 {
	public static void main(String[] args) {
		//집어넣고 나오는 작업을 1회 수행으로 봄.
		//최소 작업의 횟수 구하기 
		//슬라이딩 윈도우 사용
		int [] queue1 = {0,0};
		int [] queue2 = {0,0};
		int [] arr = new int [queue1.length+queue2.length];
		
		
		int index =0;
		int sum = 0;
		for(int i=0;i<queue1.length;i++) {
			arr[index] = queue1[i];
			sum += arr[index];
			index++;
		}
		for(int i=0;i<queue2.length;i++) {
			arr[index] = queue2[i];
			sum += arr[index];
			index++;
		}
		if(sum%2!=0) System.out.println(-1);
		int start =0;
		int last = 0;
		
		long sum1 = arr[0];
		
		while(last<arr.length) { //슬라이딩윈도우
			if(sum1<sum/2) {
				last++;
				if(last>=arr.length) {System.out.println(-1);}
				sum1+=arr[last];
			}
			else if(sum1==sum/2) {
				break;
			}
			else {
				start++;
				sum1-=arr[start-1];
			}
		}
		last++;
		int S1 = 0;
		int S2 = queue1.length;
		int answer =0;
		if(last>=queue1.length) {
			while(true) {
				if(start!=S1) {S1++;answer++;}
				if(last!=S2) {S2++;answer++;}
				if(S2>=arr.length) {
					S2 = S2-arr.length;
				}
				if(S1>=arr.length) {
					S1 = S1-arr.length;
				}
				if(start==S1 &&last==S2) break;
			}
		}
		else {
			while(true) {
				if(start!=S2) {S2++;answer++;}
				if(last!=S1) {S1++;answer++;}
				if(S2>=arr.length) {
					S2 = S2-arr.length;
				}
				if(S1>=arr.length) {
					S1 = S1-arr.length;
				}
				if(start==S2 &&last==S1) break;
			}
		}
		System.out.println(answer);
		
		
		
	}
}
