class Solution {
    static int MAX =0;
    static int [] answer;
    public int[] solution(int n, int[] info) {
        dfs(0,n,0,new int [n],info);
        return MAX!=0?answer:new int[]{-1};
    }
    //시작,끝 인덱스, 현재인덱스,조합배열, 어피치의점수 배열
    private static void dfs(int start,int limit,int idx,int [] result,int []info){
        if(idx==limit){ //양궁점수의 조합을 다 했다면 점수를 내기
            int [] arr = new int [11]; //어피치의 과녁
            int [] ans = new int [11]; //답

            for(int i=0;i<11;i++){
                arr[i] = -info[i];
            }
            for(int score:result){
                arr[10-score]++;
                ans[10-score]++;
            }
            int jumsu = 0;
            for(int i=0;i<11;i++){
                if(arr[i]>0){ //라이언이 과녁에 더 많이 맞췄을경우
                    jumsu += 10-i;
                }
                else if(arr[i]==0&&info[i]==0){
                    
                }
                else{
                    jumsu -= 10-i;
                }
            }
            if(MAX<jumsu) {
                MAX = jumsu;

                answer = ans;
            }
            return;
        }
        for(int i=start;i<=10;i++){
            result[idx] = i;
            dfs(i,limit,idx+1,result,info); //라이언의양궁의 점수 조합
        }

    }
}