class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int pos = nums.length-1;
        int[] res = new int[nums.length];
        while(i<=j){
            if(nums[i]*nums[i] < nums[j]*nums[j]){
                res[pos] = nums[j]*nums[j];
                pos--;
                j--;
            }
            else {
                res[pos] = nums[i]*nums[i];
                pos--;
                i++;
            }
            
        }
        return res;
    }
}