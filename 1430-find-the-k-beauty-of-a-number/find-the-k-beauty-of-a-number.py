class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        
        c = 0
        for i in range(len(str(num))-k+1):
            subStr = str(num)[i:i+k]
            print(subStr)

            # if len(subStr) <k:
            #     break
            if int(subStr) == 0:
                continue
            if num%int(subStr) == 0:
                c+=1
        print(c)
        return c
