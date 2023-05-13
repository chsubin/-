class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int agcd = arrayA[0];
        int bgcd = arrayB[0];
        if(arrayB.length>1){
            agcd = gcd(arrayA[0],arrayA[1]);
            bgcd = gcd(arrayB[0],arrayB[1]);
        }
        for(int i=2;i<arrayA.length;i++){
            agcd = gcd(arrayA[i],agcd);
        }
        for(int i=2;i<arrayB.length;i++){
            bgcd = gcd(arrayB[i],bgcd);
        }
        int su1= agcd;
        int su2=bgcd;
        for(int i=0;i<arrayA.length;i++){
            if(arrayB[i]%agcd==0) {
                su1 =0;
            }
            if(arrayA[i]%bgcd==0){
                su2 = 0;
            }
        }
        answer = su1>=su2?su1:su2;
        return answer;
    }
    private static int gcd(int a , int b){
        if(a<b){
            int temp = a; a =b ;b=temp;
        }
        if(a%b==0){
            return b;
        }
        else{
            return gcd(b,a%b);
        }
        
    }
}