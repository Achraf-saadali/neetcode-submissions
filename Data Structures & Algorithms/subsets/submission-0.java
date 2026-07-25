class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> subsets = new ArrayList<>();
        
        backTrack(subsets , new ArrayList<Integer>() , nums,0);

        return subsets ; 
        
    }


    private void backTrack(List<List<Integer>> subsets , List<Integer> current  , int[] nums , int n)
    {   
        // if we finished  going over all the length we store the result 
        if (nums.length == n) 
        {  // we make sure we return a new object 
           // since the current object will be altered  by using the same ref 
            subsets.add(new ArrayList<>(current));
            return ;
        }
        // now either we dont take the next element ...
        backTrack(subsets,current , nums,n+1);
        // Or we do ...
        current.add(nums[n]);
        // re deciding that for next elemnts ... 
        backTrack(subsets , current , nums ,n+1);
        // And we pop |
        current.remove(current.size()-1);

        
       
        
    }
}
