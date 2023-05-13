import java.util.*;
class Solution {
    static int answer []= new int [2];
    static int discount [] = {10,20,30,40};
    static int emoticon [] ;
    static int user [][];
    public int[] solution(int[][] users, int[] emoticons) {
        emoticon = emoticons;
        user = users;
        DFS(0,emoticon.length-1,new int [emoticon.length]);
        
        return answer;
    }
    private static void DFS(int index, int end, int [] arr){
        if(index>end) return;
        for(int i=0;i<discount.length;i++){
            arr[index] = discount[i];
            if(index==end){
                System.out.println();
                int su = 0;
                int sum =0;
                for(int j=0;j<user.length;j++){//사용자별탐색
                    int price =0;
                    for(int k=0;k<arr.length;k++){ //이모티콘별 탐색
                        if(user[j][0]<=arr[k]){
                            price +=emoticon[k]*(100-arr[k])/100;
                            //할인후 이모티콘의 가격
                        }
                    }
                    if(price>=user[j][1]) su++;
                    else {sum+=price;}
                }
                if(su>answer[0]) {answer[0] = su;answer[1] = sum;}
                if(su==answer[0]&&sum>answer[1]){
                    answer[1] = sum;
                }
            }
            DFS(index+1,end,arr);
        }
        
    }
}