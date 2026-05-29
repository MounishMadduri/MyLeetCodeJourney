class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0; // Tracks the position for the next non-zero element
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                // Swap elements at i and j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
                // Move the non-zero boundary forward
                i++;
            }
        }
    }
}