class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hm = {}
        for i in nums:
            if i not in hm:
                hm[i] = 0
            hm[i] += 1
        print(hm.values())

        for i in hm.values():
            if i!=1:
                return True
        return False

            