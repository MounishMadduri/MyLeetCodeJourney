class Solution:
    def palindrom(self, l):
        i = 0
        j = len(l) - 1
        while i < j:
            if l[i] == l[j]:
                i += 1
                j -= 1
            else:
                return False
        return True

    def validPalindrome(self, s: str) -> bool:
        i = 0
        j = len(s) - 1
        while i<j:
            if s[i] != s[j]:
                if self.palindrom(s[i+1:j+1]):
                    return True
                elif self.palindrom(s[i:j]):
                    return True
                return False
            i+=1
            j-=1
        return True
