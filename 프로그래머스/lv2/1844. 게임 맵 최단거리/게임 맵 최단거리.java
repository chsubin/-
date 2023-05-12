import java.util.LinkedList;
import java.util.Queue;

class Solution {
	static int m;
	static int n;
	static boolean visited[][];
	static int dx [] = {0,-1,0,1};
	static int dy [] = {-1,0,1,0};
	static int [][] map;
	static int  answer =0;
    public int solution(int[][] maps) {
		map = maps;
		m = maps.length;
		n = maps[0].length;
		visited = new boolean[m][n];
		
		BFS(new Node(0, 0, 1));
		
        return answer==0?-1:answer;
    }
	private static void BFS(Node node) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		visited[node.row][node.col]= true;
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			if(now.row==m-1&&now.col==n-1) {
				answer = now.depth;
				return;
			}
			for(int i=0;i<4;i++) {//상하좌우탐색
				int next_row = now.row+dy[i];
				int next_col = now.col+dx[i];
				if(next_row>=m||next_row<0)continue;
				else if(next_col>=n||next_col<0)continue;
				if(!visited[next_row][next_col]&&map[next_row][next_col]==1) {
					queue.add(new Node(next_row, next_col,now.depth+1));
					visited[next_row][next_col]= true;
				}
			}
		}
	}
}
class Node{
	int row;
	int col;
	int depth;
	public Node(int row, int col, int depth) {
		this.row = row;
		this.col = col;
		this.depth = depth;
	}
}