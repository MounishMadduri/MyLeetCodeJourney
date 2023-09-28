class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        # 10/2 = 5
        # 10/3 = 3+1 = 4 


        # moores voting algorithm

        # maximum ele can appear 2 or 1 atmost.

        c1 = 0
        c2 = 0
        e1 = None
        e2 = None

        for i in nums:
            if c1 == 0 and i !=e2:
                e1 = i
                c1+=1
                # c1 =0
            elif c2 == 0 and i !=e1:
                e2 = i
                c2+=1
                # c2 = 0
            elif e1 == i:
                c1+=1
            elif e2 == i:
                c2+=1
            else:
                c1-=1
                c2-=1
        print(e1,e2)

        res = []
        if nums.count(e1)>len(nums)//3:
            res.append(e1)
        if nums.count(e2)>len(nums)//3:
            res.append(e2)
        
        # print(res)
        return res