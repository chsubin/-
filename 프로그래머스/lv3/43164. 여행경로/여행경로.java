import java.util.*;
class Solution {
    static boolean visit[];
    static ArrayList<String> list;
    public String[] solution(String[][] tickets) {
        visit = new boolean[tickets.length];
        list = new ArrayList<>();
        
        DFS("ICN",0,"ICN",tickets);
        Collections.sort(list);
        String str =  list.get(0);
        String[] answer = str.split("/");
        
        return answer;
    }
    public static void DFS(String start,int now,String strs,String [][] tickets){
        if(tickets.length==now) list.add(strs);
        for(int i=0;i<tickets.length;i++){
            if(visit[i]) continue;
            String S = tickets[i][0];
            String E = tickets[i][1];
            if(start.equals(S)){
                visit[i] = true;
                DFS(E,now+1,strs+"/"+E,tickets);
                visit[i] = false;
            }
            
        }
        
        
    }
}