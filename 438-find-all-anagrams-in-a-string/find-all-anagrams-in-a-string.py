class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        
        res =[]

        hm ={}
        for i in range(len(p)):
            if p[i] not in hm:
                hm[p[i]] = 0
            hm[p[i]] += 1
        
        hm_res = {}
        l = 0
        for i in range(len(s)):
            if s[i] not in hm_res:
                hm_res[s[i]] = 0
            hm_res[s[i]] += 1
            
            if i - l + 1 == len(p):
                if hm_res == hm:
                    res.append(l)
                
                hm_res[s[l]] -= 1
                if hm_res[s[l]] == 0:
                    del hm_res[s[l]]
                l += 1

        return res
                
