class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        
        total = sum(nums)
        pre = 0

        for i in range(len(nums)):
            if pre == (total - pre - nums[i]):
                return i
            pre+=nums[i]
        return -1




        # pre = [0]*len(nums)
        # suf = [0]*len(nums)
        # pre[0] = nums[0]
        # for i in range(1,len(nums)):
        #     pre[i] = pre[i-1] + nums[i]
        
        # print(pre)

        # suf[-1] = nums[-1]
        # for i in range(len(nums)-2,-1,-1):
        #     suf[i] = nums[i] + suf[i+1]
        # print(suf)
        # sumi = 0
        # if suf[1] == 0:
        #     return 0
        # if pre[-1] == 0:
        #     return len(pre)-1
        # for i in range(len(nums)-1):
        #     if i>0 and pre[i-1] == suf[i+1]:
        #         return i
        # return -1

