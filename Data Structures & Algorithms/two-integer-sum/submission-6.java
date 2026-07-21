class Solution {
    public int[] twoSum(int[] nums, int target) {
    

        List<Integer>[] hold = new List[20_000_001];
        for(int i = 0 , n = nums.length ; i < n ;i++)
        {
            if(hold[nums[i]+10_000_000] == null) hold[nums[i]+10_000_000] = new ArrayList<>();
            hold[nums[i]+10_000_000] .add(i);
            
        }
        
        Arrays.sort(nums);
       
        for(int i = 0 , j = nums.length - 1 ; i < j ; )
        {
            
             if(nums[i] + nums[j] > target) j--;
            else if(nums[i] + nums[j] < target) i++;
            else
            {
                int[] answer = new int[]{hold[nums[i]+10_000_000].remove(0) , hold[nums[j]+10_000_000].remove(0)};
                Arrays.sort(answer);
                return answer  ;
            }
            

        }

       
       
        

        return new int[]{-1};
        
    }

    
}
