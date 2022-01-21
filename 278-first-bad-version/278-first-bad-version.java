/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return badversion(1, n);
    }
    public int badversion(int low, int high){
        if(low <= high){
            int mid = low + (high - low) / 2;                 // (low/2) + (high)/2;
           // System.out.println(mid);
            if(isBadVersion(mid)){
                int p = badversion(low, mid-1);
                if(p!=-1){
                    return p;
                }else{
                    return mid; 
                }  
            }else{
                return badversion(mid+1, high);
            }
        }
        return -1;
    }
}