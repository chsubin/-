package 프로그래머스course2_2;

public class Test029_유전법칙 {
	static String [] A = {"RR","Rr","Rr","rr"};
	public static void main(String[] args) {
		int [][] queries = {
				{1,1}
		};
		String answer [] = new String [queries.length];
		for(int i=0;i<queries.length;i++) {
			int n = queries[i][0];
			int p = queries[i][1];
			answer[i] = Find(n,p-1);
		}
	}

	private static String Find(int n, int p) {
		
		if(n>2) {
			String par =Find(n-1,p/4); //바로위 부모 찾기, 이 부모의 ?번쨰 자손이다.
			if(par.equals("RR")) return"RR";
			else if(par.equals("rr")) return"rr";
			else {
				return A[p%4];
				}
		}
		
		if(n==2) {
			return A[p];
		}
		if(n==1) {
			return "Rr";
		}
		
		return "";
	}
}
