class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int[] mat = matrix[0];
        
        for(int i = 0;i<matrix.length;i++){
        
             //System.out.println(matrix[i]);
            if(binarysearch( matrix[i], 0, matrix[i].length-1, target )){
               return true;
            }
        }    
     return false;
    }
    public boolean binarysearch(int[] arr,int low, int high, int target){
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target ){
                return true;
            }else if(arr[mid] < target){
                return binarysearch(arr, mid+1, high, target );
            }else{
                return binarysearch(arr, low, mid-1, target ); 
            }
        }
        
        return false;
    }
}