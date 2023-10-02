class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        
        some = sum(nums[:k])
        maxi = some/k
        for i in range(k,len(nums)):
            some+=nums[i] - nums[i-k]
            avg = some/k
            maxi = max(maxi,avg)
        return maxi
