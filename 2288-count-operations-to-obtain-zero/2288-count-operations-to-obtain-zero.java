class Solution {
    public int countOperations(int num1, int num2) {
         int count=0;
       while(num1>0 && num2>0){
         if(num1>num2){
                count+=num1/num2;
             //  count++;
             num1%=num2;
         }
         else {
            count+=num2/num1;
            //count++;
            num2%=num1;
         }
        // else if(num1==num2){
          //  num1-=num2;
           // count++;
        // }
         //else if(num1==0||num2==0){
        //    else{
          //  continue;
        // }
         //count++;
    }
    return count;
}
}