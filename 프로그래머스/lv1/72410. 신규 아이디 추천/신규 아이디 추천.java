import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer = "";
        HashSet<Integer> set = new HashSet<>();
        for(int i=(int)'a';i<=(int)'z';i++){
            set.add(i);
        }
        for(int i=(int)'0';i<=(int)'9';i++){
            set.add(i);
        }
        set.add((int)'-');
        set.add((int)'_');
        set.add((int)'.');
        boolean flag = true;
        if(new_id.length()<3||new_id.length()<15) flag = false;
        for(int i=0;i<new_id.length();i++){
            if(!set.contains((int)new_id.charAt(i))) flag = false;
        }
        if(new_id.charAt(0)=='.'||new_id.charAt(new_id.length()-1)=='.'||new_id.contains("..")) flag = false;
        String str = "";
        //1,2단계
        for(int i=0;i<new_id.length();i++){
            int ch = (int)new_id.charAt(i);
            if(ch>=65&&ch<=90) ch = ch+32;//대문자인경우
            else if(!set.contains(ch)) ch = -1; //특수문자
            if(ch!=-1) str += "" + (char)ch;
        }
        //3단계
        
        //str = str.replace("..",".");
        while(str.contains("..")){
            str= str.replace("..",".");
        }
        new_id = str;
        //4단계
        if(new_id.charAt(0)=='.') new_id = new_id.substring(1);
        if(new_id.length()>0) if(new_id.charAt(new_id.length()-1)=='.') new_id = new_id.substring(0,new_id.length()-1);
        //5단계 
        if(new_id.equals("")) new_id = "a";
        //6
        if(new_id.length()>=16) new_id = new_id.substring(0,15);
        if(new_id.length()>0) if(new_id.charAt(new_id.length()-1)=='.') new_id = new_id.substring(0,new_id.length()-1);
        //7
        while(new_id.length()<3){
            new_id += new_id.substring(new_id.length()-1);
        }
        
        return new_id;
    }
}