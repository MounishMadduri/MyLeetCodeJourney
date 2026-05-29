class Solution {
    public int maxProfit(int[] prices) {

        int i = 0;
        int j = 1;
        int max = 0;
        int diff;
        while(j<prices.length){
            if(prices[i]<prices[j]){
                diff = prices[j]-prices[i];
                max = Math.max(diff, max);
                j++;
            }
            else{
                i = j;
                j++;
            }
            


        }

        return max;
    }
}