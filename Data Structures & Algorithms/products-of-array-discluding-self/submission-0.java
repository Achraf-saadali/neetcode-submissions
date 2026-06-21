class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1 , count_zeroes = 0 ;
        // pure product without zereos and count zeroes as well  
        for(int num : nums)
        {
            if(num != 0) product *= num ;
            else count_zeroes++ ; 
        }


        // if there is no zero inside meaning that no multiplication will have zero
        // so dividing by  nums[i] itself is good
        if(count_zeroes == 0 ){
        for(int i =  nums.length - 1 ; i >= 0 ;i--)
         nums[i] = product/nums[i];
         return nums;
         }
        // if Only One zero is there meaning that all product other than the index zero
        //  will be zero whereas the index will be the product off all the others
        if(count_zeroes == 1)
        {

             for(int i =  nums.length - 1 ; i >= 0 ;i--)
             if(nums[i] ==0 )nums[i] = product;
             else nums[i] = 0 ;
             return nums;
        }

        // here its always gonna be zero since will always have somehwere other than self to 
        //literrally zero out the product 
        return new int[nums.length];
        
        
    }
}  
