class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Comparator<int[]> comp = (p1, p2) -> {
    int d1 = p1[0] * p1[0] + p1[1] * p1[1];
    int d2 = p2[0] * p2[0] + p2[1] * p2[1];
    return Integer.compare(d1, d2);
};
        PriorityQueue<int[]> q = new PriorityQueue<>(points.length,comp);
        for(int  i = points.length-1 ; i >= 0 ;i-- )
        {
            q.offer(points[i]);
            
        }


        int[] result[] = new int[k][2];

        while(k > 0 ) result[--k] = q.poll();

        return result ; 

    
    





     





     




        

    }
  
}
