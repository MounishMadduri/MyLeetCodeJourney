class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        
        l, r = 0, 0 
        some = 0
        mini = 10000000
        for r in range(len(nums)):
            some+=nums[r]
            while some>=target:
                c = r - l +1
                mini = min(mini,c)
                some-=nums[l]
                l+=1
        # print(mini)
        if mini!=10000000:
            return mini
        return 0















        # some = nums[0]

        # l = 0
        # mini = 1000
        # c = 0
        # for r in range(l+1,len(nums)):
        #     if some<target:
        #         some+=nums[r]
        #     else:
        #         c = r - l
        #         mini = min(mini,c)
        #         some-=nums[l]
        #         l+=1
        # print(l,r)
        # print(mini)