import java.util.*;
class Solution {
    public int[] solution(int n) {
		ArrayList<int []> list = new ArrayList<>();
		int sum =0;
		for(int i = 0;i<=n ;i++) {
			list.add(new int [i]);
			sum += i;
		}
		int [] answer = new int [sum];
		int last =n;
		int count = 1;
		while(count<=sum) {
			for(int i=1;i<=n;i++) {
				int [] A = list.get(i);
				for(int j=0;j<A.length;j++) {
					if(A[j]==0) {
						A[j]= count;
						count++;
						break;}
				}
			}
			int A[] = list.get(last);
			last--;
			for(int j=0;j<A.length;j++) {
				if(A[j]==0) {
					A[j] =count;
					count++;
				}
			}
			for(int i=n;i>=1;i--) {
				A = list.get(i);
				for(int j=A.length-1;j>=0;j--) {
					if(A[j]==0) {
						A[j]= count;
						count++;
						break;}
				}
			}
		}
		int index=0;
		for(int [] A:list) {
			for(int a:A) {
				answer[index]=a;
				index++;
			}
		}
        return answer;
    }
}