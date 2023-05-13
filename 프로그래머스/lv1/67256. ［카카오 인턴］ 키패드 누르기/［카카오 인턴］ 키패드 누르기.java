class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
		StringBuilder builder = new StringBuilder();
		
		int left = 4;
		int right = 4;
		int lefth = 0;
		int righth = 0;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==1||numbers[i]==4||numbers[i]==7) {
				builder.append("L");
				left=numbers[i]/3+1;
				lefth=0;
			}
			else if(numbers[i]==3||numbers[i]==6||numbers[i]==9) {
				builder.append("R");
				right=numbers[i]/3;
				righth=0;
			}
			else {
				int num = numbers[i]/3+1;
				if (numbers[i]==0)num=4;
				if(Math.abs(num-right)-righth<Math.abs(num-left)-lefth) {
					right=numbers[i]/3+1;
					if (numbers[i]==0)right=4;
					builder.append("R");
					righth=1;
				}
				else if(Math.abs(num-right)-righth==Math.abs(num-left)-lefth) {
					if(hand.substring(0, 1).equals("r")) {
						right=numbers[i]/3+1;
						if (numbers[i]==0)right=4;
						builder.append("R");
						righth=1;
					}
					else {
						left=numbers[i]/3+1;
						if (numbers[i]==0)left=4;
						builder.append("L");
						lefth=1;
					}
				}
				else {
					left=numbers[i]/3+1;
					if (numbers[i]==0)left=4;
					builder.append("L");
					lefth=1;
				}
			}
		}
		
		answer = String.valueOf(builder);
        return answer;
    }
}