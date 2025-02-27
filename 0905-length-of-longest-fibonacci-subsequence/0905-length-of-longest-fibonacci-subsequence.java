class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer> sb=new HashMap<>();
        int maxlen=0;
         for(int i=0;i<n;i++){
            sb.put(arr[i],i);
         }
         int [][] dp= new int[n][n];
         for(int j=0;j<n;j++){
            for(int i=0;i<j;i++){
                int x=arr[j]-arr[i];
                if(x<arr[i] && sb.containsKey(x)){
                    int k=sb.get(x);
                    dp[i][j]=dp[k][i]+1;
                    maxlen=Math.max(maxlen,dp[i][j]);
                }
                else{
                   dp[i][j]=2;
                }
            }
         }
         return maxlen >2 ? maxlen:0;
    }
}