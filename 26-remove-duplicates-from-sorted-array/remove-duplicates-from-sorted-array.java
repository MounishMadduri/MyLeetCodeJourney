class Solution {
    public int removeDuplicates(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();

        int pos = 0, c=0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                nums[pos] = nums[i];
                pos++;
                c++;
            }
            
        }
        return c;


    }
}