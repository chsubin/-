package 프로그래머스;

public class Test21_푸드파이트대회 {
	public static void main(String[] args) {
		int [] food = {1,3,4,6};
		String answer ="";
		
		StringBuilder builder1 = new StringBuilder();
		StringBuilder builder2 = new StringBuilder();
		for(int i=1;i<food.length;i++) {
			for(int j=1;j<=food[i]/2;j++) {
				builder1.append(i);
				builder2.insert(0, i);
			}
		}
		answer = builder1+"0"+builder2;
		
		
		
		
		System.out.println(answer);
		
	}
}
