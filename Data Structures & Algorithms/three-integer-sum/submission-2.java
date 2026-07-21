class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> answer = new ArrayList<>();
        Outside:
        for(int i = 0 , n = nums.length ; i <n && nums[i] <=0;i++)
        {  
           int value = -nums[i];
            
           for(int a = i+1 , b = n-1 ; a < b;)
           {
            if(nums[a]+ nums[b] == value)
            {
                List<Integer> L = new ArrayList<>();
                L.add(-value);
                L.add(nums[a]);
                L.add(nums[b]);
                if(!answer.contains(L)) answer.add(L);
                a++;b--;

            }
            else if(nums[a]+ nums[b] > value) b--;
            else a++;
           }

        }
        return answer ;

       
        


        
    }


}
