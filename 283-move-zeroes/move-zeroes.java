class Solution {
    public void moveZeroes(int[] nums) {
        
        int i=0;
        int pos=0;
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
        for(int j=pos;j<nums.length;j++){
            nums[j] = 0;
        }



    }
}