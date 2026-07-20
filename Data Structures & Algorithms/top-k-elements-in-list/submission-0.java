class Solution {
    class Pair implements Comparable {
      int key ;
      int value ;
      public Pair(int key , int value)
      {
         this.key = key ; 
         this.value = value ; 
      }

      @Override
      public int compareTo(Object b)
      {
         if(!(b instanceof Pair p)) return this.value ; 

         return Integer.compare(this.value , p.value);
      }
    }
    public int[] topKFrequent(int[] nums, int k) {
       
       Arrays.sort(nums);
       PriorityQueue<Pair> q = new PriorityQueue<Pair>();
      
       for (int i = 1, j = 0; i <= nums.length; i++) {
    if (i == nums.length || nums[i] != nums[j]) {
        q.offer(new Pair(nums[j], i - j));
        j = i;
    }
}


       int[] result = new int[k];
       while(q.size() > k) q.poll();
       
       for(int i = 0 ; i < k ; i++) result[i] = q.poll().key ;

       return result ; 

       



       

       

      

      
      



       }

     

      

      
       


       


       

        

        



       
        
        
    }

