import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> bucket= new ArrayList<>();
		
		int cnt=0;
		for(int i=0;i<moves.length;i++) {
			int sw=0;
			for(int j=0;j<board.length;j++) {
				if(board[j][moves[i]-1]!=0) {
					System.out.println(i+" 뽑은인형: "+board[j][moves[i]-1]);
					int su = board[j][moves[i]-1];
					
					board[j][moves[i]-1]=0;
					if(bucket.size()!=0) {
						if(bucket.get(bucket.size()-1)==su) {
							System.out.println(i+" 뽑았쪄용: "+su);
							bucket.remove(bucket.size()-1);
							cnt+=2;
							sw=1;
						}
					}
					if(sw==0) {bucket.add(su);System.out.println(su);}
					break;
				}
			}
		}
        answer = cnt;
        return answer;
    }
}