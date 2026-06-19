class Solution:
    def maxArea(self, heights: List[int]) -> int:
        max_circumeference :int = 0 ; length : int = len(heights)
        right : int = 0  ; left : int = len(heights) - 1

        while right < left :
             if heights[right] > heights[left] : 
                curr_cirumference : int = heights[left]*(left-right)
                left -=1
             else:
                 curr_cirumference : int = heights[right]*(left-right)
                 right +=1
             if  curr_cirumference > max_circumeference : max_circumeference = curr_cirumference

        return max_circumeference
