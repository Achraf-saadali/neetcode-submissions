class Solution {
    public boolean isHappy(int n) {
        

        while( n > 9)
        {
            int otherVal = 10*n ; 
            int createVal = 0 ; 

            while((otherVal /=10) != 0)
            createVal +=(otherVal%10)*(otherVal%10);

            n = createVal ; 


        }


        return n == 1 || n == 7 ;
        
    }
}
