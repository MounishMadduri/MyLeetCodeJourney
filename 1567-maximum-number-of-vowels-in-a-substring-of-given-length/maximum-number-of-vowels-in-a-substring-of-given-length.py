class Solution:
    def maxVowels(self, s: str, k: int) -> int:

        #hm = {"a": 0, "e": 0, "i": 0, "o": 0, "u": 0}
        hs = {'a','e','i','o','u'}
        firstWindow = s[0:k]
        c = 0
        maxi = 0
        for i in firstWindow:
            if i in hs:
                c+=1
        i = 0

        maxi = max(maxi, c)
        for j in range(k,len(s)):
            if s[i] in hs:
                c-=1
            i+=1
            if s[j] in hs:
                c+=1
            maxi = max(maxi, c)
        print(maxi)
        return maxi
