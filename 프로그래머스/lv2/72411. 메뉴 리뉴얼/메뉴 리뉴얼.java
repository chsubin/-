import java.util.*;
class Solution {
    static ArrayList<Character> A = new ArrayList<>();
    static ArrayList<String> imsi = new ArrayList<>();
    static int max =0;
    public String[] solution(String[] orders, int[] course) {
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<orders.length;i++){
            for(int j=0;j<orders[i].length();j++){
                char a = orders[i].charAt(j);
                if(!A.contains(a)) A.add(a);
            }
        }
        Collections.sort(A);
        for(int i=0;i<course.length;i++){
            max = 0;
            imsi = new ArrayList<>();
            for(int j=0;j<A.size();j++){
                DFS(j,course[i],A.get(j)+"",orders);
                
            }
            for(int j=0;j<imsi.size();j++){
                ans.add(imsi.get(j));
            }
            
        }
        String [] answer = new String [ans.size()];
        for(int i=0;i<ans.size();i++){
            answer[i] = ans.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void DFS(int now,int limit,String str,String []orders){
        
        if(str.length()==limit){ //최대값 찾기
            int res = 0;
            for(int i=0;i<orders.length;i++){
                boolean flag = true;
                for(int j=0;j<str.length();j++){
                    if(!orders[i].contains(str.substring(j,j+1))) {flag= false;break;}
                }
                if (flag) res++;
            }
            if(res>max&&res>1){
                imsi = new ArrayList<>();
                max = res;
                imsi.add(str);
            }
            else if(res==max&&res>1){
                imsi.add(str);
            }
            return;
        }
        for(int i=now+1;i<A.size();i++){
            DFS(i,limit,str+A.get(i),orders);
        }
    }
}