class Solution {
    int s=0;
    public int alternateDigitSum(int n){
         String str=Integer.toString(n);
         int sum=0;
         for(int i=0;i<str.length();i++){
         int digit=str.charAt(i)-'0';
         if(i%2==0){
            sum+=digit;
         }
         else{
            sum-=digit;
         }
         }
         return sum;
    }
}