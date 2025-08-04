class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.sort(nums);
        int c = 0;
        for(int i=0;i<nums.length;i=i+2){
            res[i] = nums[c];
            c++;
        }
        for(int j=1;j<nums.length;j=j+2){
            res[j] = nums[c];
            c++;
        }
        return res;
    }

}