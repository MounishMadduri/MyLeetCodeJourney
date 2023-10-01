class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        i = 0
        j = 1
        maxi = 0
        prof = 0
        while j<len(prices):
            if prices[i] > prices[j]:
                i = j
            else:
                prof = prices[j] - prices[i]
                maxi = max(prof, maxi)
            j+=1
        
        return maxi
            












































        # i = 0
        # j = 1
        # while j<len(prices):
        #     if prices[i]>prices[j]:
        #         i = j
        #         j+=1
        #     elif prices[i]<prices[j]:
        #         j+=1
        #     else:
        #         return 0
        # res = prices[i]
        # print(res)
        # print(i)
        # # maxi = max(prices[i])
        # maxi = 0
        # while i<len(prices):
            
        #     if prices[i]>maxi:
        #         maxi = prices[i]
        #     i+=1
        # print(maxi)
        # if maxi > 0 :
        #     return maxi - res
        # else:
        #     return 0
        
        


            