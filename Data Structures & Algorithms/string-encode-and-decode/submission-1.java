class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder() ; 

        for(final String word : strs)
        {
            sb.append(word.length()+"#"+word);
        }
        
        return sb.toString();

        


    }

    public List<String> decode(String str) {

        List<String> words = new ArrayList<>();

        int length = str.length();

        for(int i = 0  ; i < length ; )
        {   int wordLength = 0 ;
            while(str.charAt(i) != '#' )
            {
                wordLength = 10*wordLength + (str.charAt(i)-'0');
                i++;
            }

            if (wordLength == 0) words.add("");
            else words.add(str.substring(i+1,wordLength+i+1));
            i+=wordLength+1;
            


        }
        
        return words;
        
                    

    }
}
