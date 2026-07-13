class Solution {
    public String longestPalindrome(String s) {
        int length =s.length() ; int size = 1 ; 
        String newS = new String(s.charAt(0)+""); 
        for(int i = 0 ; i < length ; i++)
        {
            int p = i;
            int q = i ; 

            while(p >= 0 && q < length && s.charAt(p) == s.charAt(q)){p--;q++;}
            int r = i-1;
            int v = i ; 
            while(r >= 0 && v < length && s.charAt(r) == s.charAt(v)){r--;v++;}
            int t = i+1;
            int u = i ; 
            while(u >= 0 && t < length && s.charAt(u) == s.charAt(t)){u--;t++;}

            size = Math.max(Math.max(q-p+1,v-r+1),Math.max(size,t-u+1));  

            if( size== q-p+1 )  newS = s.substring(p+1,q); 
                
    
            else if(size == v-r+1) newS = s.substring(r+1,v);
            
            else if(size == t-u+1) newS = s.substring(u+1,t);
            
           
            
        }

        return newS;
        
    }
}
