class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        i = 0
        j = len(nums)-1
        while i<=j:
            m = (i+j)//2
            print(m)
            if nums[m]>target:
                j = m-1
            elif nums[m]<target:
                i = m+1
            else:
                return m
        print(m)
        if target<nums[m]:
            if m-1 <0:
                return 0
            return m
        else:
            return m+1
        
