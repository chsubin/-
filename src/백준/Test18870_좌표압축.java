package 백준;

import java.util.*;
import java.io.*;

public class Test18870_좌표압축 {
	
	static ArrayList<Integer> result = new ArrayList<Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		HashSet<Integer> set = new HashSet<>();
		
		int [] A = new int [N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
			set.add(A[i]);
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int temp = 0;
		result.addAll(set);
		Collections.sort(result);
		
		for(int a:A) {
			temp = binary(0,result.size()-1,a);
			bw.write(temp + " ");
		}
		bw.flush();
		bw.close();
		
		
	}

	private static int binary(int start, int end, int target) {
		int mid = (start+end)/2;
		if(result.get(mid)==target) {
			return mid;
		}
		else if(result.get(mid)>target) {
			end = mid-1;
		}
		else if(result.get(mid)<target) {
			start = mid +1;
		}
		return binary(start, end, target);
	}
}
