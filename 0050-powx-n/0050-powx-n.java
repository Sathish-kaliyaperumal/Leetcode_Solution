class Solution {
    public double myPow(double x, int n) {
     /* if(x==0){
        return x;
      } 
        double s=1;
      int i=1;
        while(i<=Math.abs(n)){
            s=s*x;
            i++;
        }
        if(n<0){
           return 1/s; 
        }
        else  return s;*/
        return Math.pow(x,n);
    }
}