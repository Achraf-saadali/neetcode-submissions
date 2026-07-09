class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:

        if len(nums) == 0 :return 0 
        if len(nums) > 1 :
            return self.findTargetSumWays(nums[1:],target+nums[0]) + self.findTargetSumWays(nums[1:],target-nums[0])
        
        

        value : int = 0 

        if nums[0] == target : value+=1
        if nums[0] == -target : value+=1

        return value