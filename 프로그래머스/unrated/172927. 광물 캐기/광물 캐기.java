import java.util.*;
class Solution {
    static int answer =0 ;
    public int solution(int[] picks, String[] minerals) {
        int num = (picks[0]+picks[1]+picks[2])*5;
        ArrayList<int []> list = new ArrayList<>();
        int sum =0;
        for(int i=0;i<minerals.length;i++){
            if(i==num) {
                list.add(new int []{sum,5});
                sum=0;
                break;
            }
            if(i!=0&&i%5==0) {
                list.add(new int []{sum,5});
                sum=0;
            }
            int a = 0;
            if(minerals[i].equals("diamond")) a = 25;
            else if(minerals[i].equals("iron")) a = 5;
            else if(minerals[i].equals("stone")) a = 1;
            sum +=a;            
        }
        if(sum!=0){
            list.add(new int []{sum,minerals.length%5==0?5:minerals.length%5});
        }
        Collections.sort(list,(int []o1,int []o2)->{
            return o2[0]-o1[0];
        });
        for(int i=0;i<list.size();i++){
            int a = list.get(i)[0];
            int b = list.get(i)[1];
            if(picks[0]!=0){
                picks[0]--;
                answer+=b;
            }
            else if(picks[1]!=0){
                picks[1]--;
                if(!(a==5&&b==5)){
                    answer+=a/5 ; a = a%5;
                }
                answer+=a;
            }
            else{
                picks[2]--;
                answer+=a;
            }
        }

        return answer;
    }
}