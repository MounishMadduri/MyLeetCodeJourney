class Solution {
    public int removeDuplicates(int[] nums) {
        

        HashSet<Integer> hs = new HashSet<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(!(hs.contains(nums[i]))){
                hs.add(nums[i]);
                nums[j] = nums[i];
                j++;
            }
        }
        return j;




    }
}