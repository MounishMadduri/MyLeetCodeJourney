class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        
        l = 0
        hm = {'a':0,'e':0,'i':0,'o':0,'u':0}

        sub = s[0:k]
        for i in sub:
            if i in hm:
                hm[i] += 1
        
        some = sum(hm.values())
        maxi = some
        for r in range(k,len(s)):
            if s[l] in hm:
                some-=1
            if s[r] in hm:
                some+=1
                maxi = max(maxi,some)
            l+=1
        
        return maxi

            


            

