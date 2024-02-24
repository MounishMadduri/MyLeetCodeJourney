class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        pre = [0]*len(nums)
        post = [0]*len(nums)

        pre[0] = nums[0]
        for i in range(1,len(nums)):
            pre[i] = pre[i-1]*nums[i]
        print(pre)

        post[-1] = nums[-1]
        for i in range(len(nums)-2,-1,-1):
            post[i] = post[i+1]*nums[i]
        print(post)
        res = [0]*len(nums)
        for i in range(len(nums)):
            if i ==0:
                res[i]=post[1]
            elif i == len(nums)-1:
                res[i] = pre[len(nums)-2]
            else:
                res[i] = pre[i-1]*post[i+1]
        return res
        