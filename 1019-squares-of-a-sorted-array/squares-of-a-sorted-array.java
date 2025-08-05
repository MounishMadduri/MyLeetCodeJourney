class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int i=0, j = nums.length-1, pos = nums.length-1;
        int[] res = new int[nums.length];
        while(i<=j){
            int leftSq = nums[i]*nums[i];
            int rightSq = nums[j]*nums[j];

            if(rightSq>leftSq){
                res[pos] = rightSq;
                j--;
                pos--;
            }
            else{
                res[pos] = leftSq;
                i++;
                pos--;
            }

        }
        return res;

    }
}