class Solution {
    public boolean judgeSquareSum(int c) {

    int i=0;
    long j= (long)Math.sqrt(c); //26
//   0,1,2,3,4,5
//     i       j
    long sum=0;
    while(i<=j){
        sum = i*i + j*j;
        if(sum<c){
            i++;
        }
        else if(sum>c){
            j--;
        }
        else{
            return true;
        }
    }
    return false;

    }
}