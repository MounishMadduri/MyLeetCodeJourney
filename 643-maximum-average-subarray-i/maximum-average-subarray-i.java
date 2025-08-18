class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum=0;
        double avg = 0;
        double maxAvg = Integer.MIN_VALUE;

        // 1st window
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        avg = sum/k;
        maxAvg = Math.max(avg, maxAvg);

        for(int j=k;j<nums.length;j++){
            sum -= nums[j-k];
            sum += nums[j];
            avg = sum/k;
            maxAvg = Math.max(avg, maxAvg);

        }

        return maxAvg;

    }
}