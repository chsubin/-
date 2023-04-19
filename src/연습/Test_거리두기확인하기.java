package 연습;

public class Test_거리두기확인하기 {
	public static void main(String[] args) {
		String [][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
				{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
				{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, 
				{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
				{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		
		
    int[] answer = new int [places.length];
    for(int i=0;i<places.length;i++){
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
        int result = 1;
        int drow[] ={1,0,1,2,0};
        int dcol[] ={0,1,1,0,2};
        for(int j=0;j<5;j++){
            for(int k=0;k<5;k++){
                if(seat[j][k]!='P') continue;
                int now_row = j;
                int now_col = k;
                for(int l=0;l<2;l++){
                    int new_row = j+drow[l];
                    int new_col = k+dcol[l];
                    if(new_row>=5||new_col>=5)continue;
                    if(seat[new_row][new_col]=='P') result =0;
                }
                for(int l=2;l<5;l++){
                    int new_row = j+drow[l];
                    int new_col = k+dcol[l];
                    if(new_row>=5||new_col>=5)continue;
                    if(seat[new_row][new_col]=='P'){
                        if(l==2){
                            for(int m=0;m<2;m++){
                                if(seat[now_row+drow[m]][now_col+dcol[m]]!='X') result=0;
                            }
                        }
                        else{
                            int m = l-3;
                            if(seat[now_row+drow[m]][now_col+dcol[m]]!='X') result=0;   
                        }
                        
                        
                    }
                    
                }
                
            }
        }
        answer[i] = result;
        System.out.println(answer[i]);
        
    }
	}
}
