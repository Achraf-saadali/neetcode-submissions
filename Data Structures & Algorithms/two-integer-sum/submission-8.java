class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 , n = nums.length ; i < n ; i++)
        {
            if(map.containsKey(target-nums[i])) return new int[]{map.get(target-nums[i]),i};
            map.put(nums[i],i);
        }

        return new int[0];
        
    }

    
}
