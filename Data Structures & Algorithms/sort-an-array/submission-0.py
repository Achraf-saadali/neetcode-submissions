class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        if len(nums) <= 1 : return nums

        middle :int = nums[len(nums)//2]

        return self.sortArray([num for num in nums if num < middle] )+ [num for num in nums if num == middle] + self.sortArray([num for num in nums if num > middle])
        