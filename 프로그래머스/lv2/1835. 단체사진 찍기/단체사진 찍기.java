import java.util.*;
class Solution {
    static boolean visit [];
    static int answer = 0;
    static ArrayList<char []> list = new ArrayList<>();
    public int solution(int n, String[] data) {
        answer = 0;
        char [] ch = {'A','C','F','J','M','N','R','T'};
        visit = new boolean[8];
        for(int i=0;i<ch.length;i++){
            DFS(i,0,new char[8],ch,data);
            visit = new boolean[8];
        }
        
        return answer;
    }
    private static void DFS(int now,int idx,char arr[],char [] ch,String [] data){
        visit[now] = true;
        arr[now] = ch[idx];
        if(idx==7){
            boolean flag = true;
            for(int i=0;i<data.length;i++){
                String str = data[i];
                char start = str.charAt(0);
                char end = str.charAt(2);
                char buho = str.charAt(3);
                int dis = str.charAt(4)-'0';
                int startidx = -1;
                int endidx = -1;
                for(int j=0;j<8;j++){
                    if(start==arr[j]) startidx = j;
                    if(end == arr[j]) endidx = j;
                    if(startidx!=-1&&endidx!=-1) break; 
                }
                if(buho=='<') if(Math.abs(startidx-endidx)-1>=dis) flag = false;
                if(buho=='>') if(Math.abs(startidx-endidx)-1<=dis) flag = false;
                if(buho=='=') if(Math.abs(startidx-endidx)-1!=dis) flag = false;
                if(!flag) break;
            }
            if(flag) answer++;
        }
        
        
        for(int i=0;i<8;i++){
            if(!visit[i]){
                DFS(i,idx+1,arr,ch,data);
            }
        }
        visit[now] = false;
        
    }
}