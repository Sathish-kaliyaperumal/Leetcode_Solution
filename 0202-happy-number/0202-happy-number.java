class Solution {
    public boolean isHappy(int n) {
        //if(n<10 && n>=2){
       //     return false;
       // }
        if(n==1 ||n==7)
         return true;
        while(n>9){
        int sum=0;
       while(n!=0){
        int rem=n%10;
        sum+=rem*rem;
        n/=10;
       }
    System.out.print(sum);
    n=sum;
    if(sum==1|| sum==7)
      return true;  
    }
    return false;
  }
}