class Solution {
    private static int[] isComposite = new int[5_000_000];
    static {
       
        for(int i = 2 ; i < 5_000_000;i++)
        {
            if(isComposite[i] == 1) continue ; 
            for(int j =2*i ; j < 5_000_000 ; j+=i )
            {
              isComposite[j] = 1;
            }
        }
    }
    public int countPrimes(int n) {
        if(n < 2) return 0 ; 

        int sum = 0 ; 
        for(int i = 2 ; i < n ; i++ ) sum +=1-isComposite[i];
        return sum ; 
        
    }
}