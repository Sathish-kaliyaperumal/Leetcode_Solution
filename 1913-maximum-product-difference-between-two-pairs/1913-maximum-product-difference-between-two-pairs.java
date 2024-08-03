class Solution {
    public int maxProductDifference(int[] arr) {
        Arrays.sort(arr);
       // for(int i=0;i<nums.length;i++){
           // if(true){int n=
           int n=arr.length;
         int a=   arr[0]*arr[1];
         int b=   arr[n-1]*arr[n-2];
          //  }
      //  }
     return b-a;
    }
}