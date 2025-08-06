class Solution {
    public int removeDuplicates(int[] nums) {
        

        int pos = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            else{
                nums[pos] = nums[i];
                pos++;
            }
        }
        return pos;


    }
}