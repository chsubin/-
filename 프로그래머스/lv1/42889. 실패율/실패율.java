class Solution {
    public int[] solution(int N, int[] stages) {
		int [] answer = new int [N];
		
		//스테이지 별 성공자 , 도전자 구해야함.(성공자)(실패자)
		int [][] result = new int [N][2];
		double [] per = new double [N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<stages.length;j++) {
				if(i+1<stages[j]) {
					result[i][0]++;
				}
				else if(i+1==stages[j]) {
					result[i][1]++;
				}
			}
		}
		for(int i=0;i<N;i++) {
			per[i]= (double)result[i][1]/(result[i][1]+result[i][0]);
			answer[i]=i+1;
			System.out.println(per[i]);
		}
		for(int i=1;i<N;i++) {
			for(int j=0;j<N-i;j++) {
				if(per[j]<per[j+1]) {
					double temp=per[j];per[j]=per[j+1];per[j+1]=temp;
					int temps = answer[j];answer[j]=answer[j+1];answer[j+1]=temps;
				}
			}
		}
        return answer;
    }
}