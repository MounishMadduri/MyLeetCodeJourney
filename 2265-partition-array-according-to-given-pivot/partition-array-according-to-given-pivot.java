class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int[] res =  new int[nums.length];
        int ind = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                res[ind++] = nums[i];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] == pivot){
                res[ind++] = nums[j];
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k] > pivot){
                res[ind++] = nums[k];
            }
        }
        return res;


    }
}