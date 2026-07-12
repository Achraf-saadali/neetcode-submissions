class Solution {
    public int findMin(int[] nums) {

        int length = nums.length ; 
        int i = 0 , j = length - 1;
        
        for(;i < j ;)
        {
           
            
            if(nums[i] > nums[j] ) i++;
            else j--;
        }
        System.out.println(i+""+j);
        return nums[i];
        
    }
}
