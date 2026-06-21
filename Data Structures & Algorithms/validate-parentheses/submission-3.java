class Solution {
    public boolean isValid(String str) {
       
        if((str.length() & 1) == 1 ) return false ;

         Stack<Character> s = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++)
        {   char x = (str.charAt(i));
           
           if(x == '[' || x == '{' || x == '(') s.add(x);
           else if(s.size() == 0 ) return false ;
           else {
            char y = s.pop();
           if((y =='(' && x != ')') || (y == '[' && x != ']') || (y == '{' && x != '}'))
              return false;
           } 
        }

        return s.size() == 0;
        
    }
}
