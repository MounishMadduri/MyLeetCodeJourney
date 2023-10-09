class Solution:
    def digitSum(self, s: str, k: int) -> str:
        

        while len(s) > k:

            lyst = []
            st = ''
            for i in range(len(s)):
                if len(st) <= k:
                    st+=str(s[i])
                if len(st) == k:
                    lyst.append(st)
                    st = ''
            if len(s)%k != 0:
                ext_str = ''
                for i in range(len(''.join(lyst)),len(s)):
                    ext_str += str(s[i])
                lyst.append(ext_str)
            print(lyst)
            
            for i in range(len(lyst)):
                lyst[i] = str(sum(map(int,lyst[i])))

            s = ''.join(lyst)
            print(s)
        return s

            

            
            
                