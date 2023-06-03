import java.util.*;
class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int [places.length];
        for(int i=0;i<answer.length;i++){
            answer[i] = 1;
        }
        for(int i=0;i<places.length;i++){
            String [][] A = new String[5][5];
            System.out.println("i"+i);
            for(int j=0;j<5;j++){
                for(int k=0;k<5;k++){
                    A[j][k] = places[i][j].substring(k,k+1);
                }
            }
            boolean result = true;
            for(int j=0;j<5;j++){
                for(int k=0;k<5;k++){
                    if(A[j][k].equals("P")){
                        if(!BFS(j,k,A)) answer[i] = 0;
                    }
                }
            }
            
        }
        return answer;
    }
    private static boolean BFS(int rowss, int colss ,String [][]places){
        boolean result = true;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(rowss,colss,false,0));
        while(!queue.isEmpty()){
            Node node = queue.poll(); //현재 탐색할 노드
            int [] dx = {-1,0,1,0};
            int [] dy = {0,-1,0,1};
            int row = node.row;
            int col = node.col;
            boolean part = node.part;
            int depth= node.depth;
            if(depth>=3) continue;;
            if(places[row][col].equals("X")) part = true;
            if(depth==1&&places[row][col].equals("P")) {
                return false;}
            else if(depth==2&&!(row==rowss&&col==colss)){
                if(places[row][col].equals("P")&&!part){
                    return false;
                }
            }
            for(int i=0;i<4;i++){
                int nrow = row+dx[i];
                int ncol = col+dy[i];
                if(nrow>=places.length||nrow<0) continue;
                if(ncol>=places[0].length||ncol<0) continue;
                queue.add(new Node(nrow,ncol,part,depth+1));
                queue.add(new Node(nrow,ncol,part,depth+1));
            }
            
        }
        return result;
        
    }
}
class Node{
    int row;
    int col;
    boolean part;
    int depth;
    Node(int row, int col, boolean part, int depth){
        this.row = row;
        this.col = col;
        this.part = part;
        this.depth= depth;
    }
    
}