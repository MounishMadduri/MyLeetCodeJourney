class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0;
        double avg = 0;
        double maxAvg = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i]; // 1,12,-5,-6 = 2
            avg = sum/k;  // 1/2
        }
        maxAvg = Math.max(maxAvg, avg); // 0.5

        for(int j=k;j<nums.length;j++){
            sum -= nums[j-k];
            sum += nums[j];
            avg = sum/k;
            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg;


        





    }
}