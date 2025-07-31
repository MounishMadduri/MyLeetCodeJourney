class Solution {
    public int removeElement(int[] nums, int val) {
        
        int ind = 0;
        for(int i:nums){
            if(i!=val){
                nums[ind] = i;
                ind++;
            }
        }
        return ind;

    }
}