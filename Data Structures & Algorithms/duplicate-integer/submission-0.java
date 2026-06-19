
class Solution {
    public boolean hasDuplicate(int[] nums) {

    Set h = Arrays.stream(nums).boxed().collect(Collectors.toSet());

    return (h.size()!=nums.length);

    }
}