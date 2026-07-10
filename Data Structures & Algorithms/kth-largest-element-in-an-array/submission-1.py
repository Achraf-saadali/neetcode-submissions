class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
         
        def QuickSort(nums:List[int])->List[int]:
            if(len(nums) <= 1):return nums
            value : int = nums[len(nums)//2]
            return QuickSort([num for num in nums if num > value])+[num for num in nums if num == value]+QuickSort([num for num in nums if num < value])

        return QuickSort(nums)[k-1]


        


                    




     


        
        