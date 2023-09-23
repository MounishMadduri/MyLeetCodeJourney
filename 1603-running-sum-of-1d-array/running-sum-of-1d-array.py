class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        
        add = 0
        running_sum = [0]*len(nums)

        for i in range(len(nums)):
            add+=nums[i]
            running_sum[i] = add
        
        return running_sum



