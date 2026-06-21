class Solution {
    public int search(int[] nums, int target) {
        int FindDivisionIndex = 0 ; 
        for(int i = nums.length - 1 ; i >= 1 ; i--)
        {
            if(nums[i] < nums[i-1]) {FindDivisionIndex = i ; break;}
        }
        

         int num1 =searchRight(nums,target,FindDivisionIndex);
         if(num1 != -1) return num1;
         int num2 = searchLeft(nums,target,FindDivisionIndex) ;
         return num2 ; 

        
    }
    private int searchRight(int[] nums , int target , int FindDivisionIndex )
    {
        int index = FindDivisionIndex;
        for(int i = 0 ; i <= index; )
        {
            int middle = (i+index)/2 ; 
            if(nums[middle] == target) return middle ; 
            else if (nums[middle] < target) i = middle + 1 ; 
            else index = middle - 1 ; 
        }
        return -1 ; 
    }
    private int searchLeft(int[] nums , int target , int FindDivisionIndex )
    {
          int index2 = FindDivisionIndex ; 
        for(int i = nums.length-1 ; i >= index2 ;)
        {
            int middle = (i+index2)/2 ; 
            if(nums[middle] == target) return middle ; 
            else if (nums[middle] < target) index2 = middle + 1 ; 
            else i = middle - 1 ; 
        }
        return -1 ; 
    }

}
