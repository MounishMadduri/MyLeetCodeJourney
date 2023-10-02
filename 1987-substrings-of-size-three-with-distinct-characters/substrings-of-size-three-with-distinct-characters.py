class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        
        k = 3
        c = 0
        l = 0
        for r in range(k,len(s)+1):
            if len(s[l:r]) == len(set(s[l:r])):
                c+=1
            l+=1
        print(c)
        return c