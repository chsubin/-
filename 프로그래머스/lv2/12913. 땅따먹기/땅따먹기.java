import java.util.*;
class Solution {
    int solution(int[][] land) {
		int answer=0;
        PriorityQueue<int []> queue = new PriorityQueue<>((int []o1,int [] o2)->{
            return o2[0]-o1[0];
        });
        for(int i=0;i<land[0].length;i++){
            queue.add(new int []{land[0][i],i});//[수, 인덱스]
        }
        for(int i=1;i<land.length;i++){
            int [] a = queue.poll();
            int [] b = queue.poll();
            queue = new PriorityQueue<>((int []o1,int [] o2)->{
            return o2[0]-o1[0];
        });
            for(int j=0;j<land[0].length;j++){
                if(a[1]!=j){
                    land[i][j] += a[0];
                }
                else {
                    land[i][j] += b[0];
                }
                queue.add(new int []{land[i][j],j});
            }
        }
        answer = queue.poll()[0];
		return answer;
    }
}