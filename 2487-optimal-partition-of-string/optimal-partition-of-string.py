class Solution:
    def partitionString(self, s: str) -> int:
        
        sett = set()
        c=0
        for i in s:
            if i in sett:
                sett = set()
                c+=1
                sett.add(i)
            else:
                sett.add(i) 
        # print(c)
        return c+1