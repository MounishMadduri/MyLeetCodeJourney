class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        
        c = 0
        sumi = sum(arr[:k-1])
        print(sumi)
        
        for l in range(len(arr)-k+1):
            sumi = sumi+arr[l+k-1]
            avg = sumi/k
            if avg >= threshold:
                c+=1
            sumi -= arr[l]
            print(sumi)
        return c




