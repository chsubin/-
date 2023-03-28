package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test019_K번째수구하기2 {
	static int K;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken())-1;
		
		int [] A = new int [N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		quickSort(A,0,N-1,K);
		System.out.println(A[K]);
		
	}
	private static void quickSort(int[] A, int S, int E, int K) {
		if(S<E) {
			int pivot = partition(A,S,E);
			if(pivot ==K) return;
			else if(K<pivot) {
				quickSort(A, S, pivot-1, K);
			}
			else {
				quickSort(A, pivot+1, E, K);
			}
		}
		
	}
	static int partition(int []arr,int l, int r) {
		int temp;
		int pivot = arr[r];		// pivot은 정렬의 가장 마지막 숫자로 잡아준다.
		int i =l-1;				// i는 배열의 가장 우측보다 하나 작게 잡아준다.
		for(int j=l;j<=r-1;j++) { //j : pivot과 배열의 원소(j)를 비교하는역할
			if (arr[j]<=pivot) {  //j와 pivot을 비교했을때 j가 작으면 i와 바꿔줄것이다.
				i++;temp=arr[j];arr[j]=arr[i];arr[i]=temp; //i의 역할 : pivot보다 작은 원소의 개수를 누적하며 세어준다.
			}
		}
		temp=arr[r];arr[r]=arr[i+1];arr[i+1]=temp; //pivot을 중심으로 나뉘어진다.
		return (i+1); //i+1이 pivot의 인덱스
	}
}
