class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int b =-(int)Math.pow(10,5)+1;
//int b=0;
        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];
            ///// if(sum)
            // int max=sum;
            b = Math.max(sum, b);
            if (sum < 0) {
                sum = 0;
            }
            /////
        }
        return b;
    }
}