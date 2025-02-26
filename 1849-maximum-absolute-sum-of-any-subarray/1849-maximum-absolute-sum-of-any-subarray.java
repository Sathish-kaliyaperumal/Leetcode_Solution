class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum=0,maxsofar=0,minsofar=0,minsum=0;
        for(int num:nums){
           maxsofar=Math.max(num,maxsofar+num);
           maxsum=Math.max(maxsum,maxsofar);

             minsofar=Math.min(num,minsofar+num);
           minsum=Math.min(minsum,minsofar);
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}