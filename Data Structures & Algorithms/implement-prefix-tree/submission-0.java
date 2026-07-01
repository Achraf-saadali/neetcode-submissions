class PrefixTree {
    StringBuilder sb ; 
    public PrefixTree() {
        sb = new StringBuilder("-");
         
    }

    public void insert(String word) {
        sb.append(word+"-");

    }

    public boolean search(String word) {
        for(String s : sb.toString().split("-"))
        {
            if(s.equals(word)) return true ; 
        }

        return false; 

    }

    public boolean startsWith(String prefix) {
        for(String s : sb.toString().split("-"))
        {
            if(s.startsWith(prefix)) return true ; 
        }

        return false; 

    }
}
