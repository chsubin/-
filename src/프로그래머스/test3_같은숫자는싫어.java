package 프로그래머스;

public class test3_같은숫자는싫어 {
	public static void main(String[] args) {
		int [] arr = {1,1,3,3,0,1,1};
		StringBuilder builder = new StringBuilder();
		builder.append(arr[0]);
		for(int i=1;i<arr.length;i++) {
				if(!builder.substring(builder.length()-1).equals(String.valueOf(arr[i]))) {
					builder.append(arr[i]);
				}
			}
		System.out.println(builder);
		int [] answer = new int[builder.length()];
		for(int i=0;i<answer.length;i++) {
			answer[i] = Integer.parseInt(builder.substring(i, i+1));
		}
	}
}
