package 백준;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test1697_숨바꼭질 {
	static int time;
	static int m ;
	static boolean visit[];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		m = sc.nextInt();
		
		visit = new boolean [100001];
		
		BFS(n);
		
	}
	private static void BFS(int n) {
		Queue<Pair1697> queue = new LinkedList<>();
		queue.add(new Pair1697(n,0));
		visit[n] = true;
		while(!queue.isEmpty()) {
			Pair1697 pair = queue.poll();
			int a = pair.su;
			int dep =pair.dep;
			if(2*a<100001) {
				if(!visit[2*a]) {
					queue.add(new Pair1697(2*a,dep+1));
					visit[2*a] =true;
				}
			}
			if(a+1<100001) {
				if(!visit[a+1]) {
					queue.add(new Pair1697(a+1,dep+1));
					visit[a+1] = true;
				}
			}
			if(a-1<100001&&a-1>=0) {
				if(!visit[a-1]) {
					queue.add(new Pair1697(a-1,dep+1));
					visit[a-1] = true;
				}
			}
			if(a==m) {time=dep; break;}
		}
		System.out.println(time);
	}
}
class Pair1697{
	int su;
	int dep;
	
		public Pair1697(int su, int dep) {
			this.su = su;
			this.dep = dep;
			
		}
	}
	
	
