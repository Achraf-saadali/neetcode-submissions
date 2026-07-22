class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:

        n1 : int = len(nums1) ; n2 : int = len(nums2)
        SortedArr = (nums1+nums2)
        SortedArr.sort()

        return 0.0+(SortedArr[(n1+n2)//2]+(1-(n1+n2) % 2)*SortedArr[-1+((n1+n2)//2)])/(2-((n1+n2) % 2))

       
        