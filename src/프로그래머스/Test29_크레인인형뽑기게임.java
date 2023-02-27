package 프로그래머스;

import java.util.ArrayList;

public class Test29_크레인인형뽑기게임 {
	public static void main(String[] args) {
		int [][] board = {{0,0,0,0,0},
											{0,0,1,0,3},
											{0,2,5,0,1},
											{4,2,4,4,2},
											{3,5,1,3,1}};
		int [] moves = {1,3,5,1,2,1,4};
		
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
		for(int i:bucket) {
			System.out.println(i);
		}
		
		System.out.println("정답 : "+cnt);
	}
}
