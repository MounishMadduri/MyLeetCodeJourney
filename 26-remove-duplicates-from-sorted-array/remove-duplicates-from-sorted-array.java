class Solution {
    public int removeDuplicates(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();


        int c = 0;
        int i = 0;
        int temp;
        while(i<nums.length){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                nums[c]=nums[i];
                c++;
                i++;
            }
            else{
                i++;
            }
        }
    return c;
    }
}