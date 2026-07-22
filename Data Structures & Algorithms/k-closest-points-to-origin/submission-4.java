class Solution {
    public int[][] kClosest(int[][] points, int k) {
       
         
         Comparator c = new Comparator<int[]>(){
            @Override
            public int compare(int[] a , int[] b)
            {
                return (a[1]*a[1] +a[0]*a[0]) - (b[1]*b[1] + b[0]*b[0]);
            }
         };
        
        
        PriorityQueue<int[]> q = new PriorityQueue<>(c);
         
        for(int[] point : points )
        {
            q.offer(point);
        }

        
        int[] result[] = new int[k][2];

        for(int i = 0 ; i < k ; i++) result[i] = q.poll();

        return result ; 




      

     
    

     





     




        

    }
  
}
