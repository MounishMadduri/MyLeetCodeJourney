class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        Arrays.sort(nums);
        // int i = 0;
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i <= nums.length - k; i++) {
            int j = i + k - 1;
            int diff = nums[j] - nums[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        
        return minDiff;
    }
    
}