class Solution:
    def search(self, nums: List[int], target: int) -> int:
        i = 0
        j = len(nums)-1
        while i<=j:
            median = (i+j)//2
            if nums[median]>target:
                j = median-1
            elif nums[median]<target:
                i = median+1
            else:
                return median
        return -1

