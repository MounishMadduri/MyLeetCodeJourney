class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        l = 0
        for r in range(1,len(nums)):
            if nums[l] ==0:
                nums[l], nums[r] = nums[r],nums[l]
                if nums[l]!=0:
                    l+=1
            else:
                l+=1
        print(nums)