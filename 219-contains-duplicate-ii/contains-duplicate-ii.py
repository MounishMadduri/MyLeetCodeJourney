class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        hm = {}

        i = 0
        j = 1
        while j < len(nums):
            if nums[i] not in hm:
                hm[nums[i]] = i

            if nums[j] not in hm:
                i = j
            else:
                if abs(j - hm[nums[j]]) <= k:
                    return True
                else:
                    hm[nums[j]] = j
            j+=1
        return False

        # hs = set()

        # i = 0
        # j = 1
        # while j<len(nums):
        #     if nums[i] not in hs:
        #         hs.add(nums[i])
            