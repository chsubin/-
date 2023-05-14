import java.util.*;
class Solution {
    static int parent [] ;
    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int [n];
        for(int i=0;i<parent.length;i++){
            parent[i] = i;
        }
        
        Arrays.sort(costs,(o1,o2)->{
           return o1[2]- o2[2]; //비용 오름차순으로 정렬 
        });
        for(int i=0;i<costs.length;i++){
            int a = costs[i][0];
            int b = costs[i][1];
            if(!checkSame(a,b)){
                union(a,b);
                answer+=costs[i][2];
            }
        }
        
        
        
        return answer;
    }
    static boolean checkSame(int a, int b){
        a = find(a);
        b = find(b);
        if(find(a)!=find(b)) return false;
        else return true;
    }
    static int find(int a){ //부모노드를 계속 찾아간다.
        if(a==parent[a]) return a;
        else return parent[a] = find(parent[a]);
    }
    static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a!=b){
            parent[b] = a;
        }
        
    }
}