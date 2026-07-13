class Solution {
    public int maxSubArray(int[] nums) {

        int last_value = nums[0] , curr = nums[0];

        for(int i =1 ; i < nums.length ; i++)
        { 
            curr = (curr+nums[i] > nums[i]) ? curr+nums[i]:nums[i];
            if(curr > last_value) last_value = curr; 
            
        }

        return last_value;
        
    }
}
