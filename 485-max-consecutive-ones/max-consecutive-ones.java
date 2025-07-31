class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxCount = 0;
        int c=0;
        for(int i:nums){
            if(i == 1){
                c++;
                if(c>maxCount){
                    maxCount = c;
                }
            }
            else{
                c = 0;
            }   
        }
        return maxCount;

    }
}