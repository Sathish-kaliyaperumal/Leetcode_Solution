class Solution {
    public int minimumOperations(int[] nums) {
        int a=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==0){
                continue;

            }
            else{
                       a+=1;
            }
        }
        return a;
    }
}