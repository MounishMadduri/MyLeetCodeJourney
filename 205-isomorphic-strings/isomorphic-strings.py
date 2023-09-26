class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        hm ={}
        for i in range(len(s)):
            if s[i] not in hm :
                hm[s[i]] = t[i]
        hm1 = {}
        for i in range(len(t)):
            if t[i] not in hm1:
                hm1[t[i]] = s[i]
            
        print(hm)
        print(hm1)

        res = ''
        for i in s:
            res+=hm[i]

        res1 = ''
        for i in t:
            res1+=hm1[i]
            
        return res == t and res1 == s