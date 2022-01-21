class Solution {
    public int searchInsert(int[] nums, int target) {
        return bst(0, nums.length-1, nums, target);
        
    }
    public int bst(int low, int high, int[] nums, int target){
        if(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target < nums[mid]){
                return bst(low, mid-1, nums, target);
            }else{
               return bst(mid+1, high, nums, target); 
            }
        }
        return low;
    }
}