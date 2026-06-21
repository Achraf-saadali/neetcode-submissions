class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        HashMap<String , List<String>> map = new HashMap<>();

        for(String s : strs)
        {  
            char[] chararray  = s.toCharArray();
            Arrays.sort(chararray);
            String backString = new String(chararray);
            List<String> L = map.getOrDefault(backString,new ArrayList<>());
            L.add(s);
            if(L.size()==1) map.put(backString,L);

        }
        List<List<String>> theReturnArray = new ArrayList<>();
        for(List<String> L : map.values()) theReturnArray.add(L);
        return theReturnArray ; 
        
    }
}
