import java.util.*;
class Solution {
    static int su =0;
    static int total = 0;
    public int[] solution(int[][] users, int[] emoticons) {
        
        dfs(emoticons.length,0,new int[emoticons.length],emoticons,users);
        int[] answer = {su,total};
        return answer;
    }
    private static void dfs(int limit,int idx,int [] discount,int [] emoticons,int [][] users){
        if(idx==limit){
            int sumsu =0; //서비스 가입수
            int sumprice = 0; //이모티콘판매액
            for(int i=0;i<users.length;i++){ //고객당 이모티콘 계산하기
                int dis = users[i][0]; //고객이 원하는 할인율
                int tar = users[i][1]; //고객의 기준 금액
                int sum = 0; //해당 고객의 이모티콘 판매액
                for(int j=0;j<emoticons.length;j++){//이모티콘의 가격 
                    if(discount[j]>=dis){ //할인율이 고객이 원하는 할인율을 넘어섰을때 구매
                        sum += emoticons[j]*(100-discount[j])/100;
                    }
                }
                if(sum>=tar){
                    sumsu++;
                }
                else{
                    sumprice += sum;
                }   
            }
            if(su<sumsu){//판매액이 같거나높을떄
                su = sumsu;
                total = sumprice;                
            }
            else if(su==sumsu&&total<sumprice){ //판매액이 더 높을떄
                su = sumsu;
                total = sumprice;
            }

            return;
        }
        int [] per = {10,20,30,40};
        for(int i=0;i<per.length;i++){
            discount[idx] = per[i];
            dfs(limit,idx+1,discount,emoticons,users);
        }
        
    }
}