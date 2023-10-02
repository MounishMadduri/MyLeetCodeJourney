class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        
        some = sum(nums[:k])
        maxi = some/k
        for i in range(k,len(nums)):
            some+=nums[i] - nums[i-k]
            avg = some/k
            maxi = max(maxi,avg)
        return maxi

# class Solution:
#     def findMaxAverage(self, nums: List[int], k: int) -> float:
#         some = sum(nums[:k])  # Calculate the sum of the first k elements
#         maxi = some / k  # Initialize maxi with the average of the first k elements
#         for i in range(k, len(nums)):
#             some += nums[i] - nums[i-k]  # Update sum for the sliding window
#             avg = some / k  # Calculate the average
#             maxi = max(avg, maxi)  # Update maxi if needed
#         return maxi
