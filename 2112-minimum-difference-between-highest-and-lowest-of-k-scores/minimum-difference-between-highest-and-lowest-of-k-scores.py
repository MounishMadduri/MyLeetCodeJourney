class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        
        nums.sort()
        # 1 4 7 9

        l = 0
        k = k-1
        diff = 100000000000
        for r in range(k, len(nums)):
            diff = min(abs(nums[l] - nums[r]), diff)
            l+=1
        print(diff)
        return diff



