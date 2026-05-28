class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int i = 0;
        int c = 0;
        int max =0;
        while(i<nums.length){
            if(nums[i] == 1){
                c++;
                max = Math.max(c, max);
            }
            else{
                c = 0;
            }
            i++;
        }
        return max;

    }
}