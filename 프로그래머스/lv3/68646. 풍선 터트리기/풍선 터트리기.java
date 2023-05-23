import java.util.*;
class Solution {
    public int solution(int[] a) {
        int answer = 0;
        
        int [] mini = new int [a.length];
        ArrayList<Integer> list = new ArrayList<>();
        int min_rear = a[a.length-1];
        for(int i = mini.length-2;i>=0;i--){
            mini[i] = min_rear;
            min_rear = Math.min(min_rear,a[i]);
        }

        int min = a[0];
        list.add(min);
        
        for(int i=1;i<a.length-1;i++){
            int target = a[i];
            int rear_min = mini[i];
            if(rear_min>target||min>target){
                list.add(target);
            }
            min = Math.min(min,target);
        }
        list.add(a[a.length-1]);
        answer = list.size();
        return answer;
    }
}