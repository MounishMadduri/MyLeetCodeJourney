class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:

        # initializing an array to store maximum values from the last index other than -1
        # [,  ,  ,  ,  , -1]
        # we are looping from the end, and checking max of max value[j] and max_list[j]
        
        max_list = [0]*len(arr) 
        max_list[-1] = -1

        j = 0
        for i in range(len(arr)-2,-1,-1):
            j =i+1
            max_list[i] = max(arr[j],max_list[j])

        return max_list

        