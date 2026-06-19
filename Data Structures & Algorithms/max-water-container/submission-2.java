class Solution {
    public int maxArea(int[] heights) {
        int max_circumeference = 0 , length = heights.length ; 
        for(int i = 0 , j = length - 1 ; i < j;)
        {
            int curr = (heights[i]>heights[j]) ? heights[j]*(j-- - i):heights[i]*(j-i++);
            if(curr > max_circumeference) max_circumeference = curr ;
        }
        return max_circumeference ;
        
    }
}
