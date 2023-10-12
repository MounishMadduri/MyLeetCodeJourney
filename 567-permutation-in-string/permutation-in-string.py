class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:

        if len(s1)>len(s2):
            return False
        hm = {}
        for i in s1:
            if i not in hm:
                hm[i] = 0
            hm[i] += 1
        
        comp = {}
        for i in range(len(s1)):
            if s2[i] not in comp:
                comp[s2[i]] = 0
            comp[s2[i]] += 1
        
        
        print(comp)
        l = 0
        for i in range(len(s1),len(s2)):
            if comp == hm:
                return True
            comp[s2[l]] -= 1
            if comp[s2[l]] == 0:
                del comp[s2[l]]
            l += 1
            if s2[i] not in comp:
                comp[s2[i]] = 0
            comp[s2[i]] += 1
        
        return comp == hm
            

            

        
        




















        # if len(s1)>len(s2):
        #     return False

        # hs1 = set(s1)

        # hs2 = set(s2[:len(s1)])

        
        # l = 0
        # r = len(s1)
        # while r<len(s2):
        #     if hs1 == hs2:
        #         return True
        #     hs2.remove(s2[l])
        #     hs2.add(s2[r])
        #     l+=1
        #     r+=1
        # return hs1 == hs2