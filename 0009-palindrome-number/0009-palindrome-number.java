class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        if(a<0){
           return false;
        }
        int rev=0;
        while(a!=0){
            int b=a%10;
            rev=(rev*10)+b;
            a=a/10;
        }
        if(x==rev){
          return  true;
        }
        
        return false;
        
    }
}