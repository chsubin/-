package 프로그래머스course2_2;

public class Test013_2개잏로다른비트2 {
	public static void main(String[] args) {
		long [] numbers = {1,2,3,4,5,6};
		long [] answer = new long [numbers.length];
		for(int k = 0;k<numbers.length;k++) {
			long num = numbers[k];
			String a = Long.toBinaryString(num);
			long su = numbers[k];
			if(num%2==0) {
				answer[k]=su+1;
			}
			else {
				if(!a.contains("0")) {
					a = 0+a;
					a = String.valueOf("10"+a.substring(2));
				}
				else {
					int x = a.lastIndexOf("0");
					a = a.substring(0,x)+"10"+a.substring(x+2);
				}
				int ans=0;
				for(int i=0;i<a.length();i++) {
					if(a.subSequence(i, i+1).equals("1")) ans+= Math.pow(2, a.length()-1-i);
				}
				answer[k] = toBinary(a);
			}
		}
		for(long a:answer) {
			System.out.println(a);
		}
	}
  private static long toBinary(String bit) {
    bit = new StringBuilder(bit).reverse().toString();
    long ans = 0;
    long x = 1L;
    for (int i = 0; i < bit.length(); i++) {
        if (bit.charAt(i) == '1') {
            ans += x;
        }
        x *= 2;
    }

    return ans;
  }
}
