class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length ; 
        if( n <= 1) return ; 

        int[][] matrice = new int[n][n];

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {   
              matrice[i][n-1-j] = matrix[j][i];
                
            }
        }
         for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {   
              matrix[i][j] = matrice[i][j];
                
            }
        }
        
    }
}
