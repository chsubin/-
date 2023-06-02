import java.util.*;
class Solution {
    static ArrayList<String> A = new ArrayList<>();
    public int solution(String[][] relation) {
        int answer = 0;
        DFS(0,relation[0].length,"");
        Collections.sort(A,(o1,o2)->{
            return o1.length() - o2.length();
        });
        
        for(int i=0;i<A.size();i++){
            if(!frustrate(A.get(i),relation)){A.remove(i);i--;}
        }
        for(int i=0;i<A.size();i++){
            for(int j=i+1;j<A.size();j++){
                if(include(A.get(i),A.get(j))){
                    A.remove(j); j--;
                }
            }
        }
        System.out.println();
        
        
        
        return A.size();
    }
    private static boolean frustrate(String str,String [][]relation){
        String [] imsi = new String [relation.length];
        for(int i=0;i<imsi.length;i++){
            imsi[i] = "";
        }
        for(int i=0;i<str.length();i++){
            int index = Integer.parseInt(str.substring(i,i+1));
            for(int j=0;j<imsi.length;j++){
                imsi[j] += relation[j][index]+"/";
            }
        }
        Arrays.sort(imsi);
        for(int i=1;i<imsi.length;i++){
            if(imsi[i].equals(imsi[i-1])) return false;
        }
        return true;
        
        
    }
    private static boolean include(String str1, String str2){
        //str2가 str1의 모든 원소를 포함하는지 확인하는 함수
        boolean result = true;
        for(int i=0;i<str1.length();i++){
            if(!str2.contains(str1.substring(i,i+1))) result = false;
        }
        return result;
    }
    private static void DFS(int idx,int limit,String str){
        if(!A.contains(str)&&!str.equals("")){A.add(str);}
        if(idx==limit) return;
        DFS(idx+1,limit,str+idx);
        DFS(idx+1,limit,str);
        
        
    }
    
}