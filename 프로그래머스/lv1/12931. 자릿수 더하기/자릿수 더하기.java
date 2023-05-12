import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int sum =0;
        while (n>0){
            sum+=n%10;
            n=n/10;
        }
        answer = sum;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}