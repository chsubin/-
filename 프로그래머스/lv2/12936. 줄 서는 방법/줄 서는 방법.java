import java.util.*;
class Solution {
    static ArrayList<Integer> A ;
    public int[] solution(int n, long k) {
          A  = new ArrayList<>();
        for(int i=0;i<n;i++){
            A.add(i+1);
        }
        
       int answer [] = DFS(n,k-1,new int [n],0);
        return answer;
    }
      private static int []  DFS(int su, long k , int [] arr , int start){
        if(A.size()==0){
            return arr;
        }
        //팩토리얼구하기
        long f = 1;
        for(int i = su-1;i>=1;i--){
            f = f*i;
        }
        int papa = (int)(k/f);
        long child = k%f;
        arr[start] = A.get(papa);
        A.remove(papa);
        return DFS(su-1,child,arr,start+1);


    }
}