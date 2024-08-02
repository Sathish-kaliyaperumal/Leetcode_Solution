class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
       int len1=len*(len+1)/2;
        int sum=0;
        int num2;
    
       for(int i=0;i<len;i++){
            sum=sum+nums[i];
        }
    
    
       return len1-sum;
     //  return num2;
    
}
}