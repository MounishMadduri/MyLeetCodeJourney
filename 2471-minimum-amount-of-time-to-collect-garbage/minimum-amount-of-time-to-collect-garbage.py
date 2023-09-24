class Solution:
    def garbageCollection(self, garbage: List[str], travel: List[int]) -> int:
        
        m = []
        g = []
        p = []
        
        for i in garbage:
            some = 0
            for j in i:
                if j =='G':
                    some+=1
            g.append(some)
        for i in garbage:
            some = 0
            for j in i:
                if j =='M':
                    some+=1
            m.append(some)
        for i in garbage:
            some = 0
            for j in i:
                if j =='P':
                    some+=1
            p.append(some)
        print(m, p,g)

        for i in range(len(p)-1,-1,-1):
            if p[i] != 0:
                break
            else:
                p.pop(-1)
        for i in range(len(m)-1,-1,-1):
            if m [i] != 0:
                break
            else:
                m.pop(-1)
        for i in range(len(g)-1,-1,-1):
            if g[i] != 0:
                break
            else:
                g.pop(-1)
        
        res = [p,g,m]
        print(res)
        
        temp = 0
        for i in range(len(res)):
            if len(res[i])>0:
                temp += sum(res[i])+sum(travel[0:len(res[i])-1])
        print(temp)
        return temp



        



        


        
        
        








