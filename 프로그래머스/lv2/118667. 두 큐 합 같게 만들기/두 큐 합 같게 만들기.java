import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long sum1 = 0;
        long sum2 = 0;
        for(int q:queue1){q1.add(q);sum1+=(long)q;}
        for(int q:queue2){q2.add(q);sum2+=(long)q;}
        if((sum1+sum2)%2!=0) return -1;
        int su = 0;
        for(int i=0;i<=queue1.length*3;i++){
            if (sum1==sum2) return su;
            else if(sum1<sum2){
                int a = q2.poll();
                sum2-= a;
                sum1+= a;
                q1.add(a);
                su++;
            }
            else{
                int a = q1.poll();
                sum1-= a;
                sum2+= a;
                q2.add(a);
                su++;
            }
        }
        
        return -1;
    }
}