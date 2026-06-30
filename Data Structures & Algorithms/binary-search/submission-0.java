class Solution {
    public int search(int[] nums, int target) {

        int i = 0 , j = nums.length - 1   ; 

        //Two Pointers from i -> [middle]  <- j  
         
        for( ; i < j ; )
        {
            int middle = (i+j)/2 ; 
            if(nums[middle] == target) return middle ; 

            if(nums[middle] < target) i = middle + 1  ;
            else  j = middle - 1 ;  
        }

        return  nums[(i+j)/2] == target ? (i+j)/2 : -1 ; 
        
    }
}
