class Solution {
    public int[] plusOne(int[] digits) {

        int last_value = 1 , length = digits.length ; 

        for(int i = length-1 ; i >= 0 ; i--)
        {   int temp = digits[i] ; 
            digits[i] = (temp + last_value)%10 ; 
            last_value = (temp+last_value)/10 ;  
    
        }
        if(last_value == 0) return digits ; 

        int[] newDigit = new int[length+1]; 

        newDigit[0] = 1; 
        for(int j = 1 ; j <= length ; j++) newDigit[j] = digits[j-1];

        return newDigit ;
        
    }
}
