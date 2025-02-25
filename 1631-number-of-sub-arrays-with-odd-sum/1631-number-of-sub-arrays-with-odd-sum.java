class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=1000000007;
        int oddcount=0, evencount=1;
        int sum=0,result=0;
        for(int num:arr){
            sum=(sum+num)%mod;
            if(sum%2==0){
                result=(result+oddcount)%mod;
               evencount=(evencount+1)%mod;
            }
            else{
                result=(result+evencount)%mod;
                oddcount=(oddcount+1)%mod;
            }
        }
        return result;
    }
}