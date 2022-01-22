class Solution {
    public void rotate(int[] nums, int k) {
        
        while(k > nums.length){
            k = k - nums.length;
        }
        
        if(k < nums.length){
        reverse(nums , 0 , nums.length -k-1);
        reverse(nums, nums.length - k , nums.length-1);
        reverse(nums, 0 , nums.length-1);
        }
       
    }
    
    public void reverse(int[] nums, int low, int high){
        while(low<high){
            int temp = nums[high];
            nums[high] = nums[low];
            nums[low] = temp;
            high--;
            low++;
        }
    }
}