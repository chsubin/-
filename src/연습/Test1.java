package 연습;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		String [] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String [] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
    int[] answer = new int [query.length];
    Arrays.sort(info,(o1,o2)->{
        int su1 =  Integer.parseInt(o1.substring(o1.lastIndexOf(" ")+1));
        int su2 =  Integer.parseInt(o2.substring(o2.lastIndexOf(" ")+1));
        return su1-su2;
    }); //점수별로 정렬
    
    for(String a:info) {
    	System.out.println(a);
    }
    
    
    for(int i=0;i<query.length;i++){//명령문
        String strs[] =  query[i].replace(" and "," ").split(" "); //[java,backend,junior,pizza,100]으로 만듦
        int target = Integer.parseInt(strs[4]);
        int start =0;
        int end = info.length-1;
        while(start<=end){
          int mid =(start+end)/2;
          int su = Integer.parseInt(info[mid].substring(info[mid].lastIndexOf(" ")+1));
          System.out.println(target);
          if(su<target){
              start = mid+1;
          }
          else if(su>target){
              end=mid-1;
          }
          else {start = mid; break;}
      }
        start--;
        System.out.println("start : "+start);
        
        for(int j =start;j<strs.length;j++){
            if(strs[j].equals("-")) strs[j] = "";
        }
        for(int j=0;j<info.length;j++){
            if(info[j].contains(strs[0])&&info[j].contains(strs[1])&&info[j].contains(strs[2])&&info[j].contains(strs[3])){
                String jumsu = info[j].substring(info[j].lastIndexOf(" ")+1);
                
            }
        }
            

    }
	}
}
