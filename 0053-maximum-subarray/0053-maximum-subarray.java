class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int b=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
           
            
                sum=sum+nums[i];
            /////if(sum)
             //  int max=sum;
             b=  Math.max(sum,b);
              if(sum<0){
                sum=0;
            }
        /////
        }
        return b;
    }
}