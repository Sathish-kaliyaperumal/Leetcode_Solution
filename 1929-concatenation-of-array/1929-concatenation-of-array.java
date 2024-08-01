class Solution {
    public int[] getConcatenation(int[] nums) {
       // int [] nums1=nums+nums;
       int c=nums.length;
       int b[]=Arrays.copyOf(nums,2*c);
       System.arraycopy(nums,0,b,c,c);
    return b;
    }
}