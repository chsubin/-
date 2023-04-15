package 프로그래머스course2_3;

public class Test010_방금그곡 {
	public static void main(String[] args) {
		String m = "ABC";
		String musicinfos[] = {"12:00,12:06,HELLO,ABC#ABC#ABC"};
		
		
    String answer = "";
    String [] arr = new String [musicinfos.length];
    for(int i=0;i<arr.length;i++){
        String strs[] = musicinfos[i].split(",");
        int start = Integer.parseInt(strs[0].substring(0,2))*60+Integer.parseInt(strs[0].substring(3,5));
        int last = Integer.parseInt(strs[1].substring(0,2))*60+Integer.parseInt(strs[1].substring(3,5)); //last-start 분 재생
        String melody ="";
        int index = 0;
        int sharp =0;
        for(int j=0;j<last-start;j++){
            if(index==strs[3].length()) index = index-strs[3].length();
            if(strs[3].charAt(index)=='#') {
                j--;
                sharp++;
            }
            melody += ""+strs[3].charAt(index);
            index++;
        }
        if(index<strs[3].length()) {
        	if(strs[3].charAt(index)=='#') {
        		melody+='#';
        	}
        }
        if(melody.contains(m)&&answer.length()<melody.length()-sharp){
            if(melody.charAt(melody.indexOf(m)+m.length())>=melody.length()){
                answer = strs[2];
            }
            else if(melody.charAt(melody.indexOf(m)+m.length())!='#'){
            answer = strs[2];
            }
        }
    }
    
    if(answer.equals("")) answer ="(None)";
    System.out.println(answer);
	}
}
