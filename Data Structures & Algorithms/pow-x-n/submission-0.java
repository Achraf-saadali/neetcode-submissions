class Solution {
    public double myPow(double x, int n) {
        if(x == 0 ) return 0 ; 
        if(n== 0) return 1 ; 
        Double returnVal = 1.0 ; 
        while(n >= 1){
           returnVal *=x ; 
           n--;
        
        }

        while(n <= -1) 
        {
           returnVal /=x ;
           n++; 
        }

        return returnVal ; 


        
    }
}
