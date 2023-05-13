class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        String end ="";
		for(int i=0;i<words.length;i++) {
			if(i!=0) {
				if(!words[i].substring(0,1).equals(end)) {
					answer[0]= (int)(i%n)+1;
					answer[1]= i/n+1;
					return answer;
				}
				 if(words[i].substring(0,1).equals(end)) {
					for(int j=0;j<i;j++) {
						if(words[i].equals(words[j])) {
							answer[0]= (int)(i%n)+1;
							answer[1]= i/n+1;
							return answer;
						}
					}
				 }
			}
					if(words[i].length()==1) {
						answer[0]= (int)(i%n)+1;
						answer[1]= i/n+1;
						return answer;
						
					}
					
				
			end =words[i].substring(words[i].length()-1);
			
		}

        return answer;
    }
}