class Solution {
    public int findDuplicate(int[] nums) {
        int[] counter = new int[nums.length] ;

        for(int num : nums ){ if(counter[num] == 1) return num ; counter[num]++;}
        return 0 ; 

       
        
    }
}
