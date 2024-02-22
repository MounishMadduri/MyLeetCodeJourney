class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        set_nums = set(nums)
        num_set = set()
        for i in range(1,len(nums)+1):
            num_set.add(i)
        return list(num_set - set_nums)