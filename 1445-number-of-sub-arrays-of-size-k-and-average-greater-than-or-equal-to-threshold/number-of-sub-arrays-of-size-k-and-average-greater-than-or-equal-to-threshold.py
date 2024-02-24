class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        
        i = 0 
        j = k-1
        c = 0
        sumi = sum(arr[:k-1])
        while j<len(arr):
            sumi = sumi+arr[i+k-1]
            avg = sumi/k
            if avg>=threshold:
                c+=1
            sumi -= arr[i]
            i+=1
            j+=1
        return c
            
            

