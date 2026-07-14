class Solution {
    public boolean isPalindrome(String s) {


        int length = s.length();
       
        for(int i = 0 , j= length - 1 ; i < j;)
        {  int value = Math.abs(s.charAt(i)-s.charAt(j));
           if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j))&&(value == 0  || value == 32 )){i++;j--;} 
           else if(!Character.isLetterOrDigit(s.charAt(i))){i++;}
           else if(!Character.isLetterOrDigit(s.charAt(j))){j--;}
           else return false ; 
                   
                   
                   
                   
                   
        }

        return true ;
        
    }
}
