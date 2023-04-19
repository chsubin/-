package 프로그래머스course2_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test_마법의엘리베이터 {
  static int answer =0;
  static int [] A;
  static ArrayList<Integer> trash= new ArrayList<>();
	public static void main(String[] args) {
		int storey = 2564;
    int [] B = {-1,-10,-100,-1000,-10000,-100000,-1000000,-10000000,-100000000,1,10,100,1000,10000,100000,1000000,10000000,100000000,};
    A = B;
    BFS(storey);
    System.out.println(answer);
	}
  private static void BFS(int start){
    Queue<Node엘리베이터> queue = new LinkedList<>();
    queue.add(new Node엘리베이터(start,0));
    while(!queue.isEmpty()){
    	Node엘리베이터 now = queue.poll();
        int su = now.su;
        int depth = now.depth;
        System.out.println(su);
        if(su==0){answer = now.depth;return;}
        for(int i=0;i<A.length;i++){
            int new_su = su+A[i];
            if(new_su<0||new_su>100000000){
                continue;
            }
            if(!trash.contains(new_su)){
                queue.add(new Node엘리베이터(new_su,depth+1));
                trash.add(new_su);
            }
        }
    }
  }
}
class Node엘리베이터{
	int su ;
	int depth;
	
	public Node엘리베이터(int su, int depth){
		this.su = su;
		this.depth = depth;
	}
	
}
