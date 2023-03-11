package 프로그래머스course2;

public class Test26_k진수에서소수개수구하기 {
	public static void main(String[] args) {
		int n = 437674;
		int k = 3;
		int answer =0;
		String ans = "";
		
		while(n>0) {
			ans = n%k+ans;
			n = n/k;
		}
		System.out.println(ans);
		String [] arr = ans.split("0");
		for(String a :arr) {
			System.out.println(a);
			if(a.equals(""))continue;
			long su = Long.parseLong(a);
			if(su==1) continue;
			if(su==2) {answer++;continue;}
			int sw =0;
			for(int i=2;i<=Math.sqrt(su)+1;i++) {
				if(su%i==0) {sw=1; System.out.println("su : "+su);break;} //소수일경우
			}
			if(sw==0)answer++;
		}
		System.out.println(answer);
	}
}
