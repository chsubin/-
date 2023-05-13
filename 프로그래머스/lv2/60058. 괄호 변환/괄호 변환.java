class Solution {
    public String solution(String p) {
        String answer = "";
        
        answer = make(p);
        
        return answer;
    }
    private static String make(String str){
        if(str.equals("")) return str;
        int val =0;
        int index =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                val ++;
            }
            else{
                val--;
            }
            if(val==0){
                index = i;
                break;
            }
        }
        String u = str.substring(0,index+1);
        String v = index ==str.length()-1?"":str.substring(index+1,str.length());

        val =0;
        boolean flag = true;
        for(int i=0;i<u.length();i++){
            if(u.charAt(i)=='(')val++;
            else val--;
            if(val<0)flag = false; //올바른 문자열이 아닐때
        }
        if(flag){//올바른 문자열
            return u+make(v);
        }
        else{ //올바르지 않은 문자열
            String newstr = "(";
            newstr += make(v)+")";
            u = u.substring(1,u.length()-1);
            String a ="";
            for(int i=0;i<u.length();i++){
                a += u.charAt(i)==')'?'(':")";
            }
            newstr+=a;
            return newstr;
        }
        
        
    }
}