class Solution {
    public int[] sortedSquares(int[] nums) {
        int pvt =0;
        for(int i = 1;i < nums.length;i++){
              if(nums[i] < Math.abs(nums[i-1])){
                   pvt = i;
              }
        }
          int [] arr = new int[nums.length];
        
        if(pvt > 0){
             
             int current= 0;
            int x = pvt-1;
            while(x >= 0 && pvt< nums.length){
            
                if(nums[pvt] <= Math.abs(nums[x])){
                    arr[current] = nums[pvt] * nums[pvt];
                    pvt++;
                    current++;
                }else{
                    arr[current] = nums[x] * nums[x];
                    x--;
                    current++;
                }
            }  
            
            if(x<0){
                while(pvt < nums.length){
                    arr[current] = nums[pvt] *  nums[pvt];
                    pvt++;
                    current++;
                }
            }
            
            if(x >= 0){
               while(x >= 0){
                    arr[current] = nums[x] * nums[x];
                    x--;
                    current++;
                }
            }
            
        }else{
            for(int i = 0; i<nums.length;i++){
                nums[i] =nums[i] * nums[i];
            }
            return nums;
        }
        return arr;
    }
}