package doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test021_버블소트프로그램2 {
	static int [] sorted;
	static long result =0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =  Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] arr = new int [N];
		sorted = new int [N];
		
		
		for(int i =0;i<N;i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		mergeSort(arr,0,N-1);
		System.out.println(result);
		
	}
	private static void mergeSort(int[] arr, int l, int r) {
		if(l<r) {
			int middle = (l+r)/2;
			mergeSort(arr, l, middle);
			mergeSort(arr,middle+1,r);
			merge(arr,l,middle,r);
			
		}
	}
	private static void merge(int[] arr, int l, int middle, int r) {
		int i = l;
		int j = middle+1;
		int k = l;
		
		while(i<=middle&&j<=r) {
			if(arr[i]>arr[j]) {
				sorted[k] = arr[j];
				result = result + j -k;
				j++;
			}
			else {
				sorted[k] = arr[i];
				i++;
			}
			k++;
		}
		while(i<=middle) {
			sorted[k] = arr[i];
			i++;
			k++;
		}
		while(j<=r) {
			sorted[k]= arr[j];
			j++;
			k++;
		}
		for(int t = l;t<=r;t++) {
			arr[t] = sorted[t];
		}
	}
}
