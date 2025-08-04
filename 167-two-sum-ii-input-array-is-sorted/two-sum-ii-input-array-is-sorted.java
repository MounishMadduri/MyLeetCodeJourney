class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i=0;
        int j = nums.length-1;
        int[] res = new int[2];

        while(i<j){
            if(nums[i]+nums[j] < target){
                i++;
            }
            else if(nums[i]+nums[j] > target){
                j--;
            }
            else{
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }


    }
    return res;
}
}