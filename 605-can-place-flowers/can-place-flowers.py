class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        
        a = [0]

        a.extend(flowerbed)
        a.append(0)

        print(a)
        c = 0
        for i in range(1,len(a)-1):
            if a[i] == 0 and (a[i-1] ==0 and a[i+1] ==0):
                c+=1
                a[i] = 1
        print(c, a)
        if n<=c:
            return True
        return False
