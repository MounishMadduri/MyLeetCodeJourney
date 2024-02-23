class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        hs = set()
        hm = {}
        sList = s.split()
        print(sList)
        if len(pattern)!=len(sList):
            return False 
        for i in range(len(pattern)):
            if pattern[i] not in hs:
                hs.add(pattern[i])
                hm[pattern[i]] = sList[i]
            
        res = []
        for i in pattern:
            res.append(hm[i])
        comp = ' '.join(res)

        if len(hm.values()) !=  len(set(hm.values())):
            return False
        return comp == s
        













        # chars = [c for c in pattern]
        # # chars = ['a', 'b', 'b', 'a']
        # new_chars = []
        # for i in chars:
        #     if i == 'a':
        #         new_chars.append('dog')
        #     elif i == 'b':
        #         new_chars.append('cat')
        # string = " ".join(new_chars)
        # return string == s




















        # hmOfPattern = {}
        # for i in pattern:
        #     if i not in hmOfPattern:
        #         hmOfPattern[i] = 0
        #     hmOfPattern[i]+=1
        
        # res1 = []
        # for i in pattern:
        #     res1.append(hmOfPattern[i])
        # if len(res1) != len(pattern):
        #     return False
        # hmOfS = {}
        # s = s.split(' ')

        # for i in s:
        #     if i not in hmOfS:
        #         hmOfS[i] = 0
        #     hmOfS[i]+=1
        # print(hmOfPattern.values())
        # res2 = []
        # for i in s:
        #     res2.append(hmOfS[i])
        
        # return res1 == res2