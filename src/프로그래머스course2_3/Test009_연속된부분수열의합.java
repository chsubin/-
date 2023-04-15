package 프로그래머스course2_3;

public class Test009_연속된부분수열의합 {
	public static void main(String[] args) {
		int [] sequence = {2, 2, 2, 2, 2};
		int k = 6;
		
		
    int[] answer = new int [2];
    int start = 0;
    int last = 0;
    int sum = sequence[0];
    int min =-1;
    while(last<sequence.length){
        if(last<start) break;
        if(sum<k){
            last++;
            sum +=sequence[last];
        }
        else if(sum >k){
            start++;
            sum -= sequence[start-1];
        }
        else if(sum==k){
            int len = last - start+1;

            if (min == -1) {
                min = len;
                answer[0] = start;
                answer[1] = last;
            }
            else if(min>len){
                min = len;
                answer[0] = start;
                answer[1] = last;
            }
            if(last+1<=sequence.length-1){
                last++;
                sum +=sequence[last];
            }
            else if(start+1<=sequence.length-1){
                start++;
                sum -= sequence[start-1];
            }
            else {break;}
        }
    }
    System.out.println(answer[0]);
    System.out.println(answer[1]);
	}
}
