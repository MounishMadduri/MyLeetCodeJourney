class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        i = 0
        j = 1
        profit = 0
        maxi = 0

        while j<len(prices):
            if prices[i]>prices[j]:
                i = j
            else:
                profit = prices[j]-prices[i]
                maxi = max(maxi, profit)
            j+=1
        return maxi
