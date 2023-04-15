package 프로그래머스course2_3;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Test002_두큐합같게만들기2 {
	public static void main(String[] args) {
		/*
1. queue1의 합 s1, queue2의 합 s2를 구한다. 전체 값의 합 sum = s1+s2 이다.

2. sum이 홀수라면 -1을 리턴한다.

3. 이후 s1==s2가 될 때 까지 s1이 sum/2보다 크다면 queue1에서 queue2로 값을 옮긴다(s1감소, s2증가). s2가 sum/2보다 크다면 queue2에서 queue1으로 값을 옮긴다.

4. s1==s2인 경우가 없다면 -1을 리턴해준다.
		 
		 * */
		Stack<Integer> stack = new Stack<>();
		int [] queue1 = {0,0};
		int [] queue2 = {0,0};
    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();
    long s1=0, s2=0, sum;
    for (int tmp : queue1) {q1.add(tmp); s1+=tmp;} //queue1의 합계
    for (int tmp : queue2) {q2.add(tmp); s2+=tmp;} //quque2의 합계
    sum = s1+s2; //전체 합계
    if (sum%2==1) System.out.println(-1);;
    sum/=2;
    int p1 = 0, p2 = 0, limit = queue1.length*2; //전체 개수
    while (p1<=limit && p2<=limit) {
        if (s1 == sum) System.out.println(p1+p2);
        if (s1>sum) {
            s1-=q1.peek();
            s2+=q1.peek();
            q2.add(q1.poll());
            p1++;
        } else {
            s2-=q2.peek();
            s1+=q2.peek();
            q1.add(q2.poll());
            p2++;
        }
    }
    System.out.println(-1);
		
		
	}
}
