class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
               
        hs = set()
        l = 0 
        maxi = 0
        for r in range(len(s)):
            while s[r] in hs:
                hs.remove(s[l])
                l += 1
            hs.add(s[r])
            maxi = max(maxi, len(hs))
        return maxi



            
            

            

                