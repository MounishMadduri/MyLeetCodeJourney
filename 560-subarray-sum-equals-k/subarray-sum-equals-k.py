class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        hm = { 0:1 }
        prefix = 0
        c = 0
        for i in nums:
            prefix+=i
            if prefix - k in hm:
                c+=hm[prefix - k]
            if prefix not in hm:
                hm[prefix] = 1
            elif prefix in hm:
                hm[prefix] +=1
                
            
        print(hm)
        print(c)
        return c


        














        # c = 0
        # for i in range(len(nums)):
        #     for j in range(i+1,len(nums)+1):
        #         sum_arr = 0
        #         for z in range(i,j):
        #             sum_arr += nums[z]
        #         if sum_arr == k:
        #             c+=1
        # # print(c)
        # return c