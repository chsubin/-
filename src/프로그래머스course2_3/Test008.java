package 프로그래머스course2_3;

import java.util.ArrayList;

public class Test008 {
  static ArrayList<Node> A[];
  static boolean visit[];
  static ArrayList<Integer> summit;
  static int target; // 출구
  static int intensity=10000001;
	public static void main(String[] args) {
		int n = 6;
    int[] answer = {};
    int [] gates = {1,3};
    int [] summits = {5};
    visit = new boolean[n+1];
    int [][] paths= {{1, 2, 3}, {2, 3, 5}, {2, 4, 2}, {2, 5, 4}, {3, 4, 4}, {4, 5, 3}, {4, 6, 1}, {5, 6, 1}};
    A = new ArrayList [n+1];
    for(int i=1;i<=n;i++){
        A[i] = new ArrayList<Node>();
    }
    summit = new ArrayList<Integer>();
    for(int i=0;i<summits.length;i++){ //봉우리는 한번만 방문(출구와 입구는달라야함)
        summit.add(summits[i]);
    }
    for(int i=0;i<paths.length;i++){ //그래프만들기
        int S = paths[i][0];
        int E = paths[i][1];
        int dis = paths[i][2];
        A[S].add(new Node(E,dis));
        A[E].add(new Node(S,dis));
    }
    target = gates[1];
    visit[gates[0]] = true;
    DFS(gates[0],0,1);
    
    
    System.out.println(intensity);
}
private static void DFS(int now,int distance,int level){ //최대거리를 적어줄거임.
    if (visit[now]) return;
    else if(summit.contains(now)){ //봉우리인경우
            visit[now] = true;
        level = level+1;
    }
    else if(now == target){ //출입구인경우
        if(level==2) {
            if(intensity<distance) intensity = distance;
        }
        return; 
    }
    for(Node v:A[now]){
        if(v.edge>distance) distance = v.edge; //거리 현행화
        DFS(v.node,distance,level); //다른 곳으로 보낸다.
    }
    
    
}
}
class Node{
int node;
int edge;
public Node(int node, int edge){
    this.node = node;
    this.edge = edge;
}
}