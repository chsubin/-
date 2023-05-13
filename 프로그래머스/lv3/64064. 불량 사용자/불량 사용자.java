import java.util.*;
class Solution {
    static String [] user;
    static boolean visit[];
    static int answer = 0;
    static String [] ban;
    static ArrayList<String> ans = new ArrayList<>();
    public int solution(String[] user_id, String[] banned_id) {
        user = user_id;
        visit = new boolean [user.length];
        ban = banned_id;
        DFS(0,banned_id.length,new String [banned_id.length]);
        
        return answer;
    }
    private static void DFS(int index, int end, String [] arr){
        if(index==end){//조건에 맞는지 확인
            
            for(int i=0;i<end;i++){
                String A = arr[i];
                String B = ban[i];
                if(A.length()!=B.length()){ //길이가 다르면 당연히 아니다.
                    return;
                }
                for(int j=0;j<A.length();j++){
                    if(B.substring(j,j+1).equals("*")){
                        continue;
                    }
                    else{
                        if(!A.substring(j,j+1).equals(B.substring(j,j+1))) return;
                    }
                    
                }
            }
            String [] Arr = new String [arr.length];
            for(int i=0;i<arr.length;i++){
                Arr[i] = arr[i];
            }
            Arrays.sort(Arr);
            String str="";
            for(String a:Arr){
                str+=a+"/";
            }
            if(!ans.contains(str)) {answer++;ans.add(str);}

            return;
        }
        for(int i=0;i<user.length;i++){
            if(!visit[i]){
                visit[i] = true;
                arr[index] = user[i];
                DFS(index+1,end,arr);
                visit[i] = false; //백트래킹
            }
        }
        
        
        
    }
}