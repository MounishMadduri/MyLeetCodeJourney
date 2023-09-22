class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        
        set_nums = set(nums)

        res_list = []
        for i in range(1,len(nums)+1):
            if i not in set_nums:
                res_list.append(i)
        # print(res_list)
        return res_list