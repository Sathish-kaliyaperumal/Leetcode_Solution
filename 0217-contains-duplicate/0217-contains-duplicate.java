class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> a=new HashSet<>();
         for(int i=0;i<nums.length;i++){
            if(a.contains(nums[i])){
                return true;
            }
            else{
                a.add(nums[i]);
            }
         }return false;
    }
}