class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        i = 0
        j = num//2
        if num == 1:
            return True
        while i<=j:
            m = (i+j)//2
            if m*m>num:
                j=m-1
            elif m*m<num:
                i = m+1
            else:
                return True
        return False
