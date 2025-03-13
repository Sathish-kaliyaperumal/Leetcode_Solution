class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int j=0;
        for(int i=0;i<l;i++){
            if(nums[i]!=0){
           nums[j]=nums[i];
           j++;
        }
        }
        for(int i=j;i<l;i++){
          nums[i]=0;
         // i++;
        }
  //System.out.print(Arrays.toString(nums));
    }
}
