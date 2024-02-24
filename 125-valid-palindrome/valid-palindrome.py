class Solution:
    def isPalindrome(self, s: str) -> bool:
        l =''
        for i in s:
            if i.isalpha() or i.isnumeric():
                if i.isalpha():
                    l+=i.lower()
                else:
                    l+=i
        i = 0
        j = len(l)-1
        while i<j:
            if l[i] == l[j]:
                i+=1
                j-=1
            else:
                return False
        return True