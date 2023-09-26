class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:

        max_list = [0]*len(arr)
        max_list[-1] = -1
        # max_list[-2] = arr[-1]
        maxi = 0
        j = 0
        for i in range(len(arr)-2,-1,-1):
            j =i+1
            max_list[i] = max(arr[j],max_list[j])
        # print(max_list)
        return max_list









        # res = []
        # for i in range(len(arr)-1):
        #     max_all = 0
        #     for j in range(i+1,len(arr)):
        #         if arr[j]>max_all:
        #             max_all = arr[j]
        #     res.append(max_all)
        # res.append(-1)

        # # print(res)
        # return res

        