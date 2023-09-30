class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        
        nums.sort()
        i = 0
        j = len(nums)-1

        res = []
        
        while(len(nums) != len(res)):
            res.append(nums[i])
            i+=1
            if i<=j:
                res.append(nums[j])
                j-=1
        # print(res)
        return res










        # x = 0
        # y = 0
        # # nums.sort()
        # for i in range(1,len(nums)-1):
        #     x = i-1
        #     y = i+1
        #     temp = y
        #     avg = (nums[x]+nums[temp])/2.0
        #     while temp <len(nums)-2 and avg == nums[i]:
        #         temp+=1
        #     nums[y],nums[temp] = nums[temp], nums[y]
        # print(nums)
        # return nums