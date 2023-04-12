package 프로그래머스course2_2;

public class Test021_큰수만들기 {
	public static void main(String[] args) {
		
		String number = "1231234";
		int k = 3;
    StringBuilder sb = new StringBuilder();
    int index = 0;
    int max = 0;
    for(int i=0; i<number.length() - k; i++) {//앞에서부터 숫자를 고름
        max = 0;
        for(int j = index; j<= k+i; j++) { //남은자리수에 들어갈수 있을만큼을 비교해줌,,
            if(max < number.charAt(j)-'0') {
                max = number.charAt(j)-'0';
                index = j+1;
            }
        }
    }
		System.out.println(sb.toString());

		
		
		
	}
}
