class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length*grid.length;
        int N=grid.length;
       int freq[]=new int[n+1];
       int missnum=-1,repeat=-1;
       for(int[] row:grid){
        for(int num:row){
              freq[num]++;
              if(freq[num]==2){
                repeat=num;
              }
        }
       }
              for(int i=1;i<=n;i++){
                  if(freq[i]==0){
                    missnum=i;
                    break;
                  }
              }
              return new int[]{repeat,missnum};
       }
      
    }
