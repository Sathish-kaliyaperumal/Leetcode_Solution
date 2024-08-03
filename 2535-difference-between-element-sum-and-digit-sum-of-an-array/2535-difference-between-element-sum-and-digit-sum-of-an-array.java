class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
           
            sum+=nums[i];
        int a=nums[i];
        while(a>0){
          int b=a%10;
            sum1=sum1+b;
            a=a/10;
            }
        }
        return sum-sum1;
    }
}