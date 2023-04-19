package 연습;

import java.util.ArrayList;

public class Test_줄서는방법 {
  static ArrayList<Integer> A ;
	public static void main(String[] args) {
		int  n= 20;
		int k = 1;
    A  = new ArrayList<>();
    int answer[] = new int [n];
    for(int i=0;i<n;i++){
        A.add(i+1);
    }
    int [] arr = DFS(n,k-1,new int [n],0);

    for(int a:arr) {
    	System.out.println(a);
    }
    
	}

	
  private static int []  DFS(int su, long k , int [] arr , int start){
    if(A.size()==0){
        return arr;
    }
    //팩토리얼구하기
    int f = 1;
    for(int i = su-1;i>=1;i--){
        f = f*i;
    }
    int papa = (int)k/f;
    long child = k%f;
    arr[start] = A.get(papa);
    A.remove(papa);
    return DFS(su-1,child,arr,start+1);
    
    
}
}
