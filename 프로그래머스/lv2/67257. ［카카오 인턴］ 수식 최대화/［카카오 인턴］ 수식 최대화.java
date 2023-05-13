import java.util.*;
class Solution {
    static String cal[] = {"-","*","+"};
    static boolean visit [] = new boolean[3];
    static ArrayList<String> strs;
    static ArrayList<Integer> num;
    static long max=0;
    public long solution(String expression) {
        long answer = 0;
        String temp ="";
        strs = new ArrayList<>();
        num = new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            String target = expression.substring(i,i+1);
            if(target.equals("-")||target.equals("*")||target.equals("+")){
                num.add(Integer.parseInt(temp));
                strs.add(target);
                temp ="";
            }
            else temp +=target;
        }
        num.add(Integer.parseInt(temp)); //연산자와 숫자를 나누었다.
        for(int i=0;i<cal.length;i++){
            DFS(i,0, new String [3]);
            visit = new boolean[3];
        }
        
        answer = max;
        
        
        return answer;
    }
    private static void DFS(int now,int depth,String [] arr){
        visit[now]= true;
        arr[depth] = cal[now];
        if(depth==2){ //연산하기
            System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
            ArrayList<String> sansu = new ArrayList<>();
            ArrayList<Long> su = new ArrayList<>();
            su.add((long)num.get(0));
            for(int i=0;i<strs.size();i++){
                su.add((long)num.get(i+1));
                sansu.add(strs.get(i));
            }
            for(int i=0;i<3;i++){
                String target_san = arr[i];
                for(int j=0;j<sansu.size();j++){
                    if(sansu.get(j).equals(target_san)){
                        sansu.remove(j);
                        long res=-1000;
                        if(target_san.equals("+")) res =su.get(j)+ su.get(j+1);
                        else if(target_san.equals("-")) res =su.get(j)- su.get(j+1);
                        else if(target_san.equals("*")) res =su.get(j)* su.get(j+1);
                        su.set(j,res);
                        su.remove(j+1);
                        j--;
                    }
                }                
            }
            long result = Math.abs(su.get(0));
            System.out.println(result);
            max = Math.max(result,max);
            
            return;
        }
        for(int i=0;i<cal.length;i++){
            if(!visit[i]){
                DFS(i,depth+1,arr); 
                visit[i] = false;
            }
            
            
        }
        
        
    }
}