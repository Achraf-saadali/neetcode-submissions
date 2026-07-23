class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int n  = matrix[0].length ; 
       int left  = 0 , right = matrix.length -1 ; 
       while(left < right)
       {
        int middle = left + (right-left)/2 ; 

        if(matrix[middle][0] == target || matrix[middle][n-1] == target) 
             return true ;
        else if( target > matrix[middle][0] && target < matrix[middle][n-1] ) return binarySearch(matrix[middle],target);
        else if(target < matrix[middle][0]) right = middle-1  ; 
        else left = middle+1  ;     
       }

       return binarySearch(matrix[left +(right-left)/2],target);
        
      
       

        
        
    }

    private boolean binarySearch(int[] arr , int target)
    {
        
        int i = 0 , j = arr.length-1 ;
        for(; i < j ; )
        {   int middle = i + (j-i)/2 ; 
            if(arr[middle] == target) return true ; 
            else if (arr[middle] > target) j = middle-1;
            else i = middle+1;
        } 
        return arr[i+(j-i)/2] == target ; 
    }
}
