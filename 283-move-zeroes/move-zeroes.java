class Solution {
    public void moveZeroes(int[] nums) {
        
        int i = 0;
        int j = 1;
        int temp;
        while(j<nums.length){
            if(nums[i] == 0 && nums[j]!=0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                i++;
            }
            else if(nums[i] == 0 && nums[j]==0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }

    }
}