class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int agcd = arrayA[0];
        int bgcd = arrayB[0];
        if(arrayA.length>1){
            for(int i=1;i<arrayA.length;i++){ //최대공약수 구하기
                agcd = gcd(arrayA[i],agcd);
                bgcd = gcd(arrayB[i],bgcd);
            }
        }
        int su1 = agcd;
        int su2 = bgcd;
        for(int i=0;i<arrayA.length;i++){
            if(arrayB[i]%agcd==0) {
                su1 =0;
            }
            if(arrayA[i]%bgcd==0){
                su2 = 0;
            }
        }
        return su1>su2?su1:su2;
    }
    private static int gcd(int a,int b){
        if(a<b){
            int temp = a; a = b; b = temp;
        }
        if(a%b==0) return b;
        else return gcd(b,a%b);
        
    }
}