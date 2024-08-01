class Solution {
    public int reverse(int x) {
        long b=0;
    while(x>0||x<0){
        int a=x%10;
       // return a;
       b=(long)a+(b*10);
       if(b<Math.pow(-2,31)||b>Math.pow(2,31)-1){
                 return 0;
       }
       x/=10;
    }
    return (int)b;
    }    
}