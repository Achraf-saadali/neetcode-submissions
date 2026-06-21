class Solution {
    public boolean exist(char[][] board, String word) {

        int n = board.length , m = board[0].length ; 

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ;j++)
            {
                if(board[i][j] == word.charAt(0) && DoFollowUp(board,i,j,0,word)) return true;
            }
        }

        return false ; 
        
    }

    private boolean DoFollowUp(char[][] board , int i , int j , int charIndex , String word)
    {
       if(charIndex >= word.length()) return true ; 
       else if( i <0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == ' ' || board[i][j] != word.charAt(charIndex) ) return false ; 
       char greyedCharacter = board[i][j] ; 
       board[i][j] = ' ' ;


         
      boolean answer =  DoFollowUp(board,i,j+1,charIndex+1,word) ||
        DoFollowUp(board,i,j-1,charIndex+1,word) ||
         DoFollowUp(board,i+1,j,charIndex+1,word) ||
          DoFollowUp(board,i-1,j,charIndex+1,word);

          board[i][j] = greyedCharacter ; 
          return answer ; 
    }
}
