class Solution:
    def numberOfSubarrays(self, nums: List[int], k: int) -> int:

        odd = 0
        l = 0
        res = 0
        ans = 0
        for r in range(len(nums)):
            if nums[r]%2 !=0:
                odd+=1
                res = 0
            while odd==k:
                res+=1
                if nums[l]%2 != 0:
                    odd-=1
                l+=1
            ans+=res
        # print(res)
        return ans
















        # l = 0
        # c = 0

        # res = 0
        # ans = 0
        # for r in range(len(nums)):
        #     if nums[r]%2 != 0:
        #         c+=1
        #         res = 0
        #     while c == k:
        #         res+=1
        #         if nums[l]%2 !=0:
        #             c-=1
        #         l+=1
        #     ans+=res
        # return ans
            
















        # count = 0
        # for i in range(k):
        #     if nums[i]%2 != 0:
        #         count+=1
        # print(count)
        # l = 0
        # res = 0
        # for r in range(k,len(nums)):
            
        #     if nums[r]%2 !=0:
        #         count+=1
        #     else:
        #         continue
        #     if count == k:
        #         res+=1
        #     if nums[l]%2 != 0:
        #         count-=1
        #         l+=1
        #     else:
        #         l+=1
        # return res


