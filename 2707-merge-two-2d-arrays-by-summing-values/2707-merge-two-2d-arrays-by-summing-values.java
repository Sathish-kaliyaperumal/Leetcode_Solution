class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map <Integer,Integer> result=new TreeMap<>();
        for(int i=0;i<nums1.length;i++){
            if(!result.containsKey(nums1[i][0])){
                result.put(nums1[i][0],nums1[i][1]);
            }
            else{
                result.put(nums1[i][0],result.get(nums1[i][0])+nums1[i][1]);
            }
        }
          for(int i=0;i<nums2.length;i++){
            if(!result.containsKey(nums2[i][0])){
                result.put(nums2[i][0],nums2[i][1]);
            }
            else{
                result.put(nums2[i][0],result.get(nums2[i][0])+nums2[i][1]);
            }
        }
        int ans[][]=new int[result.size()][2];
        int i=0;
        for(int a:result.keySet()){
             ans[i][0]=a;
             ans[i][1]=result.get(a);
             i++;
        }
        return ans;
    }
}
























































































































/*class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       List<int[]> sb=new ArrayList<>();
       int i=0;int j=0;
       while(i< nums1.length && j< nums2.length){
        if(nums1[i][0]<nums2[j][0]){
            sb.add(nums1[i]);
            i++;
        }
         else if(nums1[i][0]>nums2[j][0]){
            sb.add(nums2[j]);
            j++;
        }
        else{
           sb.add(new int[]{nums1[i][0],nums2[i][1]+nums2[j][1] });
           i++;
           j++;
        }
       }
        while(i<nums1.length) sb.add(nums1[i++]);
          while(j<nums2.length) sb.add(nums2[j++]);
      // }
    
      return sb.toArray(new int[sb.size()][]);
    } 
    }
*/
        
    
