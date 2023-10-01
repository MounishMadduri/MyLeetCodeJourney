class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        
        hm = {}

        for i, n  in enumerate(nums):
            if n not in hm:
                hm[n] = [i]
            else:
                hm[n].append(i)
        print(hm)

        for i in hm.values():
            if len(i)>1:
                x = 0
                y = 1
                while y<len(i):
                    if abs(i[x]-i[y])<=k:
                        return True
                    else:
                        x = y
                    y+=1
        return False

