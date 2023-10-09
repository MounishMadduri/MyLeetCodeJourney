class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        
        l = 0

        prod = 1
        res = 0
        for r in range(len(nums)):
            prod = prod*nums[r]
            
            while l<=r and prod>=k:
                prod = prod//nums[l]
                l+=1
            res += r-l+1
        return res

            


        
        print(res)