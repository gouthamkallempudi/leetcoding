class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int current =0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <= nums2[j]){
                arr[current] = nums1[i];
                current++;
                i++;
            }else{
                arr[current] = nums2[j];
                current++;
                j++;
            }
        }
        
        while(i<nums1.length){
            arr[current] = nums1[i];
            current++;
            i++; 
        }
       while(j < nums2.length) {
        arr[current] = nums2[j];
        current++;
        j++;   
       }
       
        
      int mid =(arr.length)/2;  
        
      if(arr.length%2 !=0){
          return arr[mid];
      } 
    
      
      return (arr[mid-1] + arr[mid])/2.0 ; 
    }
}