class Solution {
    public int reverse(int x) {

        int isNegative = 0 ; 
        long value = x , result = 0L;  
        if(x < 0 ) {value =-x;isNegative = 1;}

        while(value > 0 )
        {
            result = result*10 + value%10;
            value /=10;
        }

        if(isNegative == 1) result = -result ; 

        if( result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE) return (int)result ; 
        return 0 ; 
        
    }
}
