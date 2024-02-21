class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        # isomorphic means s should be replacesd with t and t should be replace with s
        
        hm1 = {}
        hm2 = {}

        for i in range(len(s)):
            if s[i] not in hm1:
                hm1[s[i]] = {t[i]}
            else:
                hm1[s[i]].add(t[i])
        for i in hm1.values():
            if len(i)>1:
                return False
        # print(hm1)
        hm1 = {}
        for i in s:
            if i not in hm1:
                hm1[i] = 0
            hm1[i]+=1
        for i in t:
            if i not in hm2:
                hm2[i] = 0
            hm2[i]+=1

        r1 = ''
        for i in s:
            r1+=str(hm1[i])
        r2 = ''
        for i in t:
            r2+=str(hm2[i])
        return r1==r2