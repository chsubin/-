import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
		int answer = 1;
		Arrays.sort(arr);
		
		int bigyo = arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			int a = arr[i+1];
			int b = bigyo;
			int min = a*b ;
			int max = 0;
			while(true) {
				if(a%b==0) {
					max = b;
					bigyo =min/max;
					System.out.println("bigyo : "+bigyo);
					break;
				}
				int temp;
				temp = a; 
				a = b;
				b = temp%b;
			}
		}
		answer = bigyo;
        return answer;
    }
}