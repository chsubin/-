class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
            int play= 0;
        for(int i=0;i<musicinfos.length;i++){
            String strs[] = musicinfos[i].split(",");
            int start = Integer.parseInt(strs[0].substring(0,2))*60+Integer.parseInt(strs[0].substring(3,5));
            int last = Integer.parseInt(strs[1].substring(0,2))*60+Integer.parseInt(strs[1].substring(3,5)); 
            String melody ="";
            int index = 0;

            m = m.replace("C#","c").replace("D#","d").replace("F#","f").replace("G#","g").replace("A#","a").replace("E#","e").replace("B#","b");
            strs[3] = strs[3].replace("C#","c").replace("D#","d").replace("F#","f").replace("G#","g").replace("A#","a").replace("E#","e").replace("B#","b");
            for(int j=0;j<last-start;j++){
                if(index==strs[3].length()) index = index-strs[3].length();
                melody += ""+strs[3].charAt(index);
                index++;
            }
            if(melody.contains(m)&&play<melody.length()){
                 play = melody.length();
                answer = strs[2];
            }
        }
        
        if(answer.equals("")) answer ="(None)";
        return answer;
    }
}