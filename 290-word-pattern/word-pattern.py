class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        hm1 = {}

        s = s.split(' ')

        if len(pattern)!=len(s):
            return False
        for i, n in enumerate(pattern) :
            if n in hm1:
                if hm1[n] == s[i]:
                    continue
                else:
                    return False
            
            else:
                if s[i] in set(hm1.values()):
                    return False
                hm1[n] = s[i]
        return True

        

        













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