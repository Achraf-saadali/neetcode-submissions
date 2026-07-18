class Solution {
    public int maxProfit(int[] prices) {


        int min = prices[0] , maxP = 0  ; 

        for(int i = 1 , n = prices.length ; i <n ;i++)
        {
            if(prices[i]- min > maxP) maxP =prices[i]-min ;
            if(min > prices[i]) min = prices[i];
        }

        return maxP ; 
        
    }
}
