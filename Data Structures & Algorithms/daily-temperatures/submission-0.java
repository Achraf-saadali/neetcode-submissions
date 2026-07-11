class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int length = temperatures.length ; 

       int[] result = new int[length];

       Stack<Integer> s = new Stack<Integer>();
       

       for(int i = 1 ; i < length ; i++)
       {
        s.add(i-1);
        while(!s.isEmpty()  && temperatures[s.peek()] < temperatures[i])
        {
            int j = s.pop() ; result[j] = (i-j);
        }
       }
      

       return result ; 
       

        
    }
}
