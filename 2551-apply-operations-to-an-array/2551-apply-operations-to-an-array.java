class Solution {
    public int[] applyOperations(int[] nums) {
       int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]&& nums[i]!=0){
                 nums[i]*=2;
                nums[i+1]=0;
            }
        }
            int result[]=new int[n];
            int index=0;
            for(int arr:nums){
                if(arr!=0){
                    result[index++]=arr;
                }
            }
           
        return result;
    }
     
}