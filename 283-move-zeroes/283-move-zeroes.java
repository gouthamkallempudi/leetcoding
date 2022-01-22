class Solution {
    public void moveZeroes(int[] nums) {
        
        boolean isno = false;
        int p;
        for( p = 0; p<nums.length;p++){
            if(nums[p] == 0){
                isno = true;
                break;
            }
        
        }
        if(isno){
           
        
           int i = p;
           int j = p;

            while(i < nums.length && j<nums.length){
               if(nums[i] == 0){
                   i++;
               } else if(nums[i] !=0){
                   int temp = nums[i];
                   nums[i] = nums[j];
                   nums[j] = temp;
                   j++;
                   i++;
               }
            }
        
        }
        
    }
}