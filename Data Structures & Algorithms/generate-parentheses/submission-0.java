class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> parenthesis = new ArrayList<>() ;

        backTrack(parenthesis , new StringBuilder(n) , 0,0,n);


        return parenthesis ; 
        
    }

    private void backTrack(List<String> parenthesis , StringBuilder sb  , int left , int right , int n )
     {
        /* base case or final case where we store
         the current combination of parenthesis */
        if( left == n && right == n)
        {
            parenthesis.add(sb.toString());
            return ;
        }
        /* First we need our open parenthesis from the left 
           to start the combo
        */
        if (left < n)
        {
            sb.append('(');
            backTrack(parenthesis , sb , left+1, right,n);
            sb.setLength(sb.length()-1);
        }

        /*
         then we finish things up by a closing parenthesis 
         */  
        if(right < left)
        {
            sb.append(')');
            backTrack(parenthesis , sb , left ,right+1,n);
            sb.setLength(sb.length()-1);

        }
     }
}
