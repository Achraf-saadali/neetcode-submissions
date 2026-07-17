class Solution {
    private List<Integer> L = new ArrayList<>();
    
    public int[] countBits(int n) {
        int lastIn = L.size()-1;
        int[] arr = new int[n+1];
        for(int i = 0  ; i <= n ; i++)
        {  if(i <=lastIn)  arr[i] = L.get(i);
        else
        {
            arr[i] = countBit(i);
        }

        }
        return  arr ; 
    }
    private int countBit(int v)
    {
        if(v <= 1) {L.add(v);return v ;} 

        int result = 0  , value = v; 
        while(v > 0 )
        {
            result +=(v & 1);
            v >>= 1;
        }
        L.add(result);
        return result ; 
    }
}
