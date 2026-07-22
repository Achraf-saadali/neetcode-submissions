class Solution {
    public int lengthOfLongestSubstring(String s) {

        int length = s.length() , size = Math.min(1,s.length())  ; 
        
        // q-1  p+1  +1 == q-1 - (p+1) +1 == q-p-1
        for(int i = 0; i < length ; i++)
        {
            int p = i , q= i+1;
            
            Set<Character> set = new HashSet<>();
            while(( p >=0 && !set.contains(s.charAt(p))|| q < length && !set.contains(s.charAt(q))))
            {    
                // System.out.println(s.charAt(p)+""+s.charAt(q));
                if(p >=0 && ! set.contains(s.charAt(p)) )
                {
                   
                    set.add(s.charAt(p));
                    p--; 
                }
                if(q < length && !set.contains(s.charAt(q)))
                {
                     
                    set.add(s.charAt(q));
                    q++;    
                }

            }
            if(size < q-p-1) size = q-p-1;
              
        }


        return size ; 
        
    }
}
