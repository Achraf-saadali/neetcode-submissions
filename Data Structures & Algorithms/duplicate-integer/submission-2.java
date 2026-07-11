class Solution {
    public boolean hasDuplicate(int[] nums) {

       Arrays.sort(nums);
       int length = nums.length;

       for(int i = 1 ; i < length ; i++)
       {
        if(nums[i-1] == nums[i]) return true ; 
       }

       return false ; 
        

        
        
    }
}