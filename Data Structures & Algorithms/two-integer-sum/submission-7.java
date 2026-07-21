class Solution {
    public int[] twoSum(int[] nums, int target) {
        int min = 10_000_000 , max = -10_000_000;
        for(int num : nums)
        {
            if(num > max) max = num ; 
            if(num < min) min = num ; 
        }
    

        List<Integer>[] hold = new List[max-min+1];
        for(int i = 0 , n = nums.length ; i < n ;i++)
        {
            if(hold[nums[i]-min] == null) hold[nums[i]-min] = new ArrayList<>();
            hold[nums[i]-min] .add(i);
            
        }
        
        Arrays.sort(nums);
       
        for(int i = 0 , j = nums.length - 1 ; i < j ; )
        {
            
             if(nums[i] + nums[j] > target) j--;
            else if(nums[i] + nums[j] < target) i++;
            else
            {
                int[] answer = new int[]{hold[nums[i]-min].remove(0) , hold[nums[j]-min].remove(0)};
                Arrays.sort(answer);
                return answer  ;
            }
            

        }

       
       
        

        return new int[]{-1};
        
    }

    
}
