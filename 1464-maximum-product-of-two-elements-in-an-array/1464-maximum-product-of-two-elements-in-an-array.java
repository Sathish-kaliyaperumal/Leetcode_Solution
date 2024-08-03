class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int b=nums.length;
        int a=(nums[b-1]-1)*(nums[b-2]-1);
        return a;
    }
}