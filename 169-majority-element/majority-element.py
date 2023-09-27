class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        
        # hm = {}
        # for i in nums:
        #     if i not in hm:
        #         hm[i] = 0
        #     hm[i]+=1
        
        # for i in hm:
        #     if hm[i] >len(nums)//2:
        #         return i

        ele = 0
        c = 0
        for i in nums:
            if c == 0:
                ele = i
            if i == ele:
                c+=1
            else:
                c-=1
        # print(ele)

        return ele