/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
         int e=n;
         int s=1;
         while(s<=e){
         int w=s+((e-s)/2);
        if(!isBadVersion(w)){
            s=w+1;
        }
        else{
             e=w-1;
        }
         }return s;
    }
}