class Solution {
    static int result =1;
    public int[] solution(String[][] places) {
        int[] answer = new int [places.length];
        for(int i=0;i<places.length;i++){
            result =1;
            char [][] seat = new char[5][5];
            for(int j=0;j<5;j++){
                for(int k=0;k<5;k++){
                    seat[j][k] = places[i][j].charAt(k);
                }
            }
            for(int j=0;j<5;j++){
                for(int k=0;k<5;k++){
                    seat[j][k] = places[i][j].charAt(k);
                }
            }
            for(int j=0;j<5;j++){
                for(int k=0;k<5;k++){
                    if(seat[j][k]=='P'){
                    DFS(j,k,j,k,"",seat);
                    }
                }
            }
    
            answer[i] = result;
        }
        return answer;
    }
    private static void DFS(int orr,int orc,int row,int col,String str,char [][] seat){
        int drow[] ={-1,0,1,0};
        int dcol[] ={0,-1,0,1};
        if(str.equals("P")){
            result =0;
            return;
        }
        else if(str.equals("OP")){
            result= 0;
            return;
        }
        if(str.length()==2) return;
        for(int i=0;i<4;i++){
            int newrow = row+drow[i];
            int newcol = col+dcol[i];
            if(newrow==orr&&newcol==orc) continue;
            if(newrow>=5||newrow<0||newcol>=5||newcol<0) continue;
            DFS(orr,orc,newrow,newcol,str+seat[newrow][newcol],seat);
        }
        
        
        
    }
}