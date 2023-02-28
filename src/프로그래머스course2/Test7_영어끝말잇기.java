package 프로그래머스course2;

public class Test7_영어끝말잇기 {
	public static void main(String[] args) {
		int n=2 ;
	//	String [] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		String [] words = {"land", "dream", "mom","mom","ror"};
		int [] answer = new int [2];
		//같은단어를 두번 말하거나 , 끝과 반대되는 말을 햇을경우!
		String end = "";
		for(int i=0;i<words.length;i++) {
			if(i!=0) {
				if(words[i].substring(0,1).equals(end)) {
					for(int j=0;j<i;j++) {
						if(words[i].equals(words[j])) {
							answer[0]= (int)(i%n)+1;
							answer[1]= i/n+1;
							break;
						}
					}
				}
				if(!words[i].substring(0,1).equals(end)) {
					answer[0]= (int)(i%n)+1;
					answer[1]= i/n+1;
					break;
				}
			}
			if(words[i].length()==1) {
				answer[0]= (int)(i%n)+1;
				answer[1]= i/n+1;
				break;
				
			}
					
				
			end =words[i].substring(words[i].length()-1);
			
		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		
		
		
	}
}
