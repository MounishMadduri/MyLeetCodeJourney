class Solution {
    public boolean judgeSquareSum(int c) {
        
        int i = 0;
        long j = (long)Math.sqrt(c);

        long res = 0;
        while(i<=j){
            res = i*i + j*j;
            if(res<c){
                i++;
            }
            else if(res>c){
                j--;
            }
            else{
                return true;
            }
        }
        return false;


    }
}