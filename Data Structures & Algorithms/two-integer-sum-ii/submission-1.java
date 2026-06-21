class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Bear in Mind that numbers is sorted so..... 
        for(int i = 0, j =numbers.length - 1 ; i < j;)
        {
            if(numbers[i] + numbers[j] == target) return new int[]{i+1,j+1};
            // Having a lesser sum implies adding more which implies as well incremeting i 
            // Due to sorted array otherwise its high implying  a decrementing for it 
            if(numbers[i]+numbers[j] < target) i++ ; 
            else j-- ; 
        }

        // if nothing was found
        return new int[0];
    }
}
