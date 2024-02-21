class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        
        hm = {}
        c = 0
        for i in nums2:
            hm[i] = c
            c+=1
        # print(hm)
        res = []
        for i in nums1:
            r = -1
            while hm[i] <len(nums2)-1:
                if nums2[hm[i]+1]<i:
                    hm[i]+=1
                else:
                    r = nums2[hm[i]+1]
                    break
            res.append(r)
        return res




















        '''z = 0
        stack = []
        for i in range(nums2.index(nums1[z])+1,len(nums2)):
            if not stack:
                stack.append(nums2[i])
                if stack[-1]>nums1[z]:
                    stack.pop()
            else:
                if '''
            
            
        
        