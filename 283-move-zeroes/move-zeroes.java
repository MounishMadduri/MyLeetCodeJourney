class Solution {
    public void moveZeroes(int[] nums) {
        
        int pos=0;
        int i=0;

        while(i<nums.length){
            if(nums[i] == 0){
                i++;
            }
            else{
                nums[pos] = nums[i];
                pos++;
                i++;
            }
        }
        for(int k = pos;k<nums.length;k++){
            nums[k] = 0;
        }



    }
}