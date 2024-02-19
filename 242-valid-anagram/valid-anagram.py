class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        hm1 = {}
        for i in s:
            if i not in hm1:
                hm1[i] = 0
            hm1[i] += 1
        hm2 = {}
        for i in t:
            if i not in hm2:
                hm2[i] = 0
            hm2[i] += 1
        return hm1==hm2