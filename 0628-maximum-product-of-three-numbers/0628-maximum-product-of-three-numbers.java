class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
         int a=nums.length;
        int b=(nums[a-1])*(nums[a-2])*(nums[a-3]);
        int c=(nums[0])*(nums[1])*(nums[a-1]);
        System.out.print(c);
        if(b>c){
        return b;
    }
    return c;
    }

}