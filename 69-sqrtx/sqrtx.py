class Solution:
    def mySqrt(self, x: int) -> int:
        i = 0
        j = x
        while i<=j:
            m = (i+j)//2
            p = m*m
            print(p,m)
            if p>x:
                j = m-1
            elif p<x:
                i = m+1
            else:
                return m
            print(m)
        return j

