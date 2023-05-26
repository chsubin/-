class Solution {
    static int [] number;
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        number = numbers;
        DFS(0,0,number.length,target);
        
        
        return answer;
    }
    public static void DFS(int su,int i,int len,int real){
        if(su==real&&i== len) answer++;
        if(i== len) return;
        int target = number[i];
        DFS(su+target,i+1,len,real);
        DFS(su-target,i+1,len,real);
        
    }
}