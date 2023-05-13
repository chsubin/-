import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<genres.length;i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }//장르의 재생횟수 구하기
        Set<String> set = map.keySet();
        String [] keys = new String[set.size()];
        set.toArray(keys);
        Collection <Integer> list = map.values();
        Integer vals [] = new Integer[list.size()];
        list.toArray(vals);
        PriorityQueue<String []> queue = new PriorityQueue<>((o1,o2)->{
            return Integer.parseInt(o2[1])-Integer.parseInt(o1[1]);//내림차
        });
        for(int i=0;i<keys.length;i++){
            queue.add(new String []{keys[i],vals[i]+""});
        }

        while(!queue.isEmpty()){
            String [] A = queue.poll();
            String str =  A[0];
            PriorityQueue<int []> small = new PriorityQueue<>((o1,o2)->{
                return o2[1]-o1[1];
            });
            for(int i=0;i<genres.length;i++){
                if(str.equals(genres[i])){
                    small.add(new int[]{i,plays[i]});
                }
                
            }
            int a = small.poll()[0];
            ans.add(a);
            int b = 0;
            if(!small.isEmpty()){
                b = small.poll()[0];
                ans.add(b);
            }
            
        }
        int [] answer = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}