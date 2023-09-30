class Solution:
    def findAndReplacePattern(self, words: List[str], pattern: str) -> List[str]:
        
        resList = []
        for i in words:
            hm = {}

            for j in range(len(i)):
                if len(i)!=len(pattern):
                    continue
                if i[j] not in hm and pattern[j] not in set(hm.values()):
                    hm[i[j]] = pattern[j]
            print(hm)                    
            res = ''        
            for x in i:
                if x in hm:
                    res+=hm[x]
            if res == pattern:
                resList.append(i)
        # print(resList)
        return resList
