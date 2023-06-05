import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int belt = 1;
        int index = 0; //order를 가리키는 인덱스
        Stack<Integer> stack = new Stack<>();
        while(true){
            if(order[index]==belt){ //벨트에 있는 숫자 확인 - 맞을경우
                answer++;
                index++;
                belt++;
            }
            else if(!stack.isEmpty()){ //보조컨베이어벨트 확인
                int a = stack.peek();
                if(a==order[index]){ //해당숫자가 맞을경우
                    stack.pop();
                    answer++;
                    index++;
                }
                else { //둘다 아닐 경우
                    stack.add(belt);
                    belt++;
                }
            }
            else { //둘다 아닐 경우
                stack.add(belt);
                belt++;
            }
            if(belt>order.length) break;
        }
        while(!stack.isEmpty()){
            if(order[index]==stack.pop()){
                answer++;
                index++;
            }
            else break;
        }
        
        
        
        return answer;
    }
}