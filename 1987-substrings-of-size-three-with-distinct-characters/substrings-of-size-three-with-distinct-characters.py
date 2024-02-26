class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        
        i = 0
        c = 0
        for j in range(3,len(s)+1):
            if len(s[i:j]) == len(set(s[i:j])):
                c+=1
            i+=1
        return c