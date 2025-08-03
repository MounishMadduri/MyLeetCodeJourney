class Solution {
    public int[] sortedSquares(int[] nums) {
        

        int[] res = new int[nums.length];

        int i = 0;
        int j = nums.length-1;
        int k = nums.length-1;

        while(i<=j){
            int leftSq = nums[i]*nums[i];
            int rightSq = nums[j]*nums[j];

            if(leftSq>rightSq){
                res[k] = leftSq;
                i++;
            }
            else{
                res[k] = rightSq;
                j--;
            }
            k--;
        }
        return res;


    }
}