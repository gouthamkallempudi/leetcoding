class Solution {
    public int search(int[] nums, int target) {
        return search(0, nums.length-1, nums, target);              
    }
    
    public int search(int low, int high, int[] nums, int target){
        if(low<=high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target < nums[mid]){
                return search(low, mid-1, nums, target);
            }else{
                return search(mid +1, high, nums, target); 
            }
        }else{
            return -1;
        }
        
    }
}