class Solution {
    public int findKthLargest(int[] nums, int k) {
       
        var L = findKList(nums,0,nums.length-1 , k);
        return L[k-1];

        
        
    }

    private int[] findKList(int[] nums , int left , int right , int k )
    {
        if(right == left) return  new int[]{nums[right]};

        int[] A = findKList(nums,left,(left+right)/2,k);

        int[] B = findKList(nums,((left+right)/2)+1,right,k);

        int[] L = new int[k] ;

        int lengthA = A.length , lengthB = B.length ;
        int i = 0 , b = 0 , a = 0  ; 
        for(; i < k && a < lengthA && b <lengthB ; )
        {
            if(A[a] >= B[b])
            {   L[i] = A[a];
                a++;
            }
            else
            {
                L[i] = B[b];
                b++;
            }
            i++;

        }
        for(; i < k && a < lengthA  ; )
        {
            L[i] = A[a];
            a++;
            i++;

        }
        for( ; i < k &&  b <lengthB ; )
        {

                L[i] = B[b];
                b++;
                i++;

        }

        return L ; 
    }
}
