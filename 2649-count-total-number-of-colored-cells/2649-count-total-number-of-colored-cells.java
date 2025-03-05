class Solution {
    public long coloredCells(int n) {
       return (long)(n)*(n)+(long)(n-1)*(n-1);
     /*   if(n==1){
            return 1;
        }
        long k=4,m=1;
        for(int i=1;i<n;i++){
            m+=k;
            k=k+4;
        }
        return m;   */
    }
}