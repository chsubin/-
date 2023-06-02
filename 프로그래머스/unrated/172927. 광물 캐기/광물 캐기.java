import java.util.*;
class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int sum = picks[0]+picks[1]+picks[2];
        int imsi[] = new int [6];
        ArrayList<int []> list = new ArrayList<>();
        
        int total =0;
        boolean flag = true;
        int num = 0;
        for(int i=0;i<minerals.length;i++){
            if(i==sum*5) { //도끼가 남아있지 않은경우
                flag = false;
                break;
            }
            num++;
            if(minerals[i].equals("diamond")){
                total += 25;
            }
            else if(minerals[i].equals("iron")){
                total += 5;
            }
            else{
                total +=1;
            }
            if((i+1)%5==0&&i!=0){ //도끼를 다섯번 다 쓴경우
                list.add(new int []{total,5});
                total = 0;
                num = 0;
            }
        }
        if(flag&&total!=0){
            list.add(new int []{total,num});
        }
        Collections.sort(list,(o1,o2)->{
            return o2[0]-o1[0];
        });
        for(int i=0;i<list.size();i++){
            int A [] = list.get(i);
            int T = A[0];
            int N = A[1];
            System.out.println(T+" "+N);
            if(picks[0]!=0){
                picks[0]--;
                answer+= N;
            }
            else if(picks[1]!=0){
                picks[1]--;
                if(N!=5){
                    answer+= T/5;
                    answer+= T%5;
                }
                else if(N==5){
                    if(T==5){
                        answer+=5;
                    }
                    else{
                        answer+= T/5;
                        answer+= T%5;
                    }
                }
                
            }
            else{
                picks[2]--;
                answer+= T;
            }
            System.out.println(answer);
            
        }
        
        
        
        return answer;
    }
}