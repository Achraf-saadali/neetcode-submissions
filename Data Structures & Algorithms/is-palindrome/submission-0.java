class Solution {
    public boolean isPalindrome(String s) {


        int length = s.length();
         s = s.toLowerCase(); 
        for(int i = 0 , j= length - 1 ; i < j;)
        {
           if(s.charAt(i) == s.charAt(j)){i++;j--;} 
           else if(!Character.isLetterOrDigit(s.charAt(i))){i++;}
           else if(!Character.isLetterOrDigit(s.charAt(j))){j--;}
           else return false ; 
                   
                   
                   
                   
                   
        }

        return true ;
        
    }
}
