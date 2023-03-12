package 프로그래머스course2_2;

import java.util.HashMap;

public class Test3_주차요금계산 {
	public static void main(String[] args) {
		int [] fees = {180,5000,10,600};
		String [] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		HashMap<String, 차량> map = new HashMap<>();
		
		for(String a : records) {
			String [] arr =  a.split(" ");
			if(arr[2].equals("IN")) {
				if(map.containsKey(arr[1])) {
					map.get(arr[1]).putIn(arr[0]);
				}
				else {map.put(arr[1], new 차량(arr[0]));}
			}
			else {
				map.get(arr[1]).putOut(arr[0]);
			}
			System.out.print(arr[1] + " : ");
			System.out.println(map.get(arr[1]));
		}
		System.out.println(map.size());
		int [] answer = new int [map.size()];
		int cnt =0;
		for(String a:map.keySet()) {
			answer[cnt] =map.get(a).getFee(fees);
			System.out.println(map.get(a));
			cnt++;
		}
		for(int a : answer) {
			System.out.println(a);
		}
	}
		
		
}
class 차량{
	private int intime=0;
	private int outtime=0;
	private int time=0;
	private int price=0;
	
	public 차량(String in) {
		putIn(in);
	}
	public void putIn(String in) {
		String [] ins = in.split(":");
		for(int i=0;i<ins.length;i++) {
			if(i==0) {
				intime= Integer.parseInt(ins[i])*60;
			}
			else if(i==1) {
				intime+= Integer.parseInt(ins[i]);
			}
		}
	}
	public void putOut(String out) {
		String [] outs = out.split(":");
		for(int i=0;i<outs.length;i++) {
			if(i==0) {
				outtime+= Integer.parseInt(outs[0])*60;
			}
			else if(i==1) {
				outtime+= Integer.parseInt(outs[1]);
				time += outtime-intime;
				intime =0; outtime=0;
			}
		}
	};
	public int getFee(int [] fees) {
		if(intime!=0&&outtime==0) {
			putOut("23:59");
		}
		price += fees[1];
		time = time-fees[0];
		if(time>0) {
			price += (time/10)*fees[3];
		}
		return price;
	}
	@Override
	public String toString() {
		return "차량 [intime=" + intime + ", outtime=" + outtime + ", time=" + time + ", price=" + price + "]";
	}
	
}
