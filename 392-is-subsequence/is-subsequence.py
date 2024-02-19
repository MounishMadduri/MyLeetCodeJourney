class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:

        i = 0
        j = 0
        if s == '':
            return True
        while i<len(s) and j<len(t):
            if t[j] == s[i]:
                i+=1
                j+=1
            else:
                j+=1
        print(i)
        return i == len(s)
        



        i = j = 0
        c = 0
        while i<len(s):
            if s[i] == t[j]:
                c+=1
                i+=1
            else:
                j+=1
                c+=1
        return len(s) == c































