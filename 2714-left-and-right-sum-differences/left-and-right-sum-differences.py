class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        
        prefix_sum = [0]*len(nums)
        
        
        prefix_sum[0] = 0
        for i in range(1,len(nums)):
            prefix_sum[i] = prefix_sum[i-1]+nums[i-1]

        print(prefix_sum)

        suffix_sum = [0]*len(nums)

        suffix_sum[-1] = 0
        for i in range(len(nums)-2,-1,-1):
            suffix_sum[i] = suffix_sum[i+1]+nums[i+1]


        print(suffix_sum)

        res = [0]*len(nums)
        for i in range(len(nums)):
            res[i] = abs(prefix_sum[i]-suffix_sum[i])
        
        return res