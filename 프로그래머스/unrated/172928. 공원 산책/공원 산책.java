class Solution {
    public int[] solution(String[] park, String[] routes) {
        /*
        O, X  장애물이 존재한다.-> 사이에 장애물이 있는지 or 공원을 벗어나는지
        가로길이 W row
        세로길이 H col
        모든명령 수행후 놓인 위치
        동서남북
        */
        int cur_row = 0;
        int cur_col = 0;
        String [][] parks = new String [park.length][park[0].length()];
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park[0].length();j++){
                parks[i][j] = park[i].substring(j,j+1);
                if(parks[i][j].equals("S")) {cur_row= i; cur_col = j;}
            }
        }
        
        for(int i=0;i<routes.length;i++){
            String direction = routes[i].split(" ")[0];
            int num =  Integer.parseInt(routes[i].split(" ")[1]);
            int new_row = 0;
            int new_col = 0;
            boolean flag= true;
            if(direction.equals("E")){//col ++
                new_row = cur_row;
                new_col = cur_col + num;
                if(new_col<0||new_col>=parks[0].length) continue;
                for(int j= cur_col;j<=new_col;j++){
                    if(parks[new_row][j].equals("X")) flag = false;
                }
            }
            else if(direction.equals("W")) {//col --
                new_row = cur_row;
                new_col = cur_col - num;
                if(new_col<0||new_col>=parks[0].length) continue;
                for(int j= cur_col;j>=new_col;j--){
                    if(parks[new_row][j].equals("X")) flag = false;
                }
            }
            else if(direction.equals("S")) { //row++
                new_row = cur_row + num;
                new_col = cur_col;
                if(new_row<0||new_row>=parks.length) continue;
                for(int j= cur_row;j<=new_row;j++){
                    if(parks[j][new_col].equals("X")) flag = false;
                }
            }
            else if(direction.equals("N")) {//row--
                new_row = cur_row - num;
                new_col = cur_col;
                if(new_row<0||new_row>=parks.length) continue;
                for(int j= cur_row;j>=new_row;j--){
                    if(parks[j][new_col].equals("X")) flag = false;
                }
            }
            if(!flag) continue;
            cur_row = new_row;
            cur_col = new_col;
            //System.out.println(cur_row+"_"+cur_col);
            
        }    
        int[] answer = {cur_row, cur_col};
        return answer;
    }
}