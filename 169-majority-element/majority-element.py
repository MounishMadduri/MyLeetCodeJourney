class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        c = 0
        ele = 0
        for i in nums:
            if c == 0:
                ele = i
            if i == ele:
                c+=1
            else:
                c-=1
        # print(ele)

        return ele

        