class Solution:
    def pivotInteger(self, n: int) -> int:
        
        arr = []
        for i in range(1,n+1):
            arr.append(i)
        
        print(arr)

        pre = [0]*n

        pre[0] = arr[0]
        for i in range(1,n):
            pre[i] = arr[i] + pre[i-1]
        
        print(pre)

        post = [0]*n
        post[-1] = arr[-1]

        for i in range(n-2,-1,-1):
            post[i] = arr[i]+post[i+1]
        
        print(post)

        for i in range(n):
            if pre[i] == post[i]:
                return i+1
        return -1