class Solution {
    public boolean isAnagram(String s, String t) {
      
      // can't have the sameWord if we dont have the same amount of letters
      if(s.length() != t.length()) return false ; 
      
      // count the alphabet on each side
      int[] counter = new int[26] ; 

      for(int j = s.length() - 1 ; j >= 0 ;j--)
       { 
        // I can only have the same amount of letters on each letter if its index
        // will neutralize on zero eventually ...
        counter[s.charAt(j)-'a']++;
        counter[t.charAt(j)-'a']--;}
    
    // Checking inconsistencies ...
    for(int val : counter)  if(val != 0 ) return false; 
    
    // otherWise we are anagrams !!
    return true ; }
}
