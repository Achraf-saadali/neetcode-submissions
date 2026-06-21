class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0 ; 
        Arrays.sort(nums) ; 
        int count = 0 ,max = 0 , length = nums.length ; 
    
        for(int i = 0 ; i < length-1 ; i++)
        {  int diff = nums[i+1] - nums[i];
            if(diff <= 1) count+=diff;
           
           else {max = (count >= max) ? count : max ;count = 0;}

        }
        return Math.max(count , max)+1 ;
        
    }
}
