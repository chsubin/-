import java.util.*;
class Solution {
    private static boolean[] visited;
    private static List<String>result = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        
        DFS(0,"ICN","ICN",tickets);
        Collections.sort(result);
        String [] answer = result.get(0).split(" ");
        
        
        return answer;
    }
    private static void DFS(int now,String start,String route,String [][]tickets){
        if(now==tickets.length){
            result.add(route);
            return;
        }
        for(int i=0;i<tickets.length;i++){
            if(tickets[i][0].equals(start)&&!visited[i]){
                visited[i] = true;
                DFS(now+1,tickets[i][1],route+" "+tickets[i][1],tickets);
                visited[i] = false;
            }
        }
        
    }
}