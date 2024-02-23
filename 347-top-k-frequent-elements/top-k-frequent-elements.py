class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hm = {}
        for i in nums:
            if i not in hm:
                hm[i] = 0
            hm[i]+=1
        desc = sorted(hm.values(), reverse = True)
        print(desc)

        sort = {k: v for k, v in sorted(hm.items(), key=lambda item: item[1])}
        print(sort.keys())
        
        keys = []
        for i in sort:
            keys.append(i)
        print(keys)
        r = []
        for i in range(len(keys)-1,len(keys)-(k+1),-1):
            r.append(keys[i])
        return r
        

        