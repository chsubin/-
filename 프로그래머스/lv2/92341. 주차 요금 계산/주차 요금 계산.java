import java.util.TreeMap;

class Solution {
    public int[] solution(int[] fees, String[] records) {
				TreeMap<Integer, int []> map = new TreeMap<>();
		
		for(String a : records) {
			String [] arr =  a.split(" ");
			if(arr[2].equals("IN")) {
				if(map.containsKey(Integer.parseInt(arr[1]))) {
					map.put(Integer.parseInt(arr[1]) ,putIn(map.get(Integer.parseInt(arr[1])),arr[0]));
				}
				else {
					map.put(Integer.parseInt(arr[1]), new int [4]);
					map.put(Integer.parseInt(arr[1]),putIn(map.get(Integer.parseInt(arr[1])),arr[0]));
				}
			}
			else {
				map.put(Integer.parseInt(arr[1]),putOut(map.get(Integer.parseInt(arr[1])),arr[0]));
			}
		}
		int [] answer = new int [map.size()];
		int cnt =0;
		for(int a:map.keySet()) {
			answer[cnt] =getFee(map.get(a),fees);
			cnt++;
		}
        return answer;
    }

	private static int getFee(int[] arr, int[] fees) {
		if(arr[0]!=0&&arr[1]==0) {
			putOut(arr, "23:59");
		}
		if(arr[0]==0&&arr[1]==0&&arr[2]==0) {
			putOut(arr, "23:59");
		}
		arr[3] += fees[1];
		arr[2]= arr[2]-fees[0];
		if(arr[2]>0) {
			arr[3]+= (arr[2]%fees[2]==0?arr[2]/fees[2]:(arr[2]/fees[2]+1))*fees[3];
		}
		return arr[3];
	}

	private static int[] putOut(int[] arr, String out) {
		String [] outs = out.split(":");
		for(int i=0;i<outs.length;i++) {
			if(i==0) {
				arr[1]+= Integer.parseInt(outs[0])*60;
			}
			else if(i==1) {
				arr[1]+= Integer.parseInt(outs[1]);
				arr[2] += arr[1]-arr[0];
				arr[0]=0; arr[1]=0;
			}
		}
		return arr;
	}

	private static int[] putIn(int[] arr, String in) {
			String [] ins = in.split(":");
			for(int i=0;i<ins.length;i++) {
				if(i==0) {
					arr[0]= Integer.parseInt(ins[i])*60;
				}
				else if(i==1) {
					arr[0]+= Integer.parseInt(ins[i]);
				}
			}
			return arr;
	}
}

	