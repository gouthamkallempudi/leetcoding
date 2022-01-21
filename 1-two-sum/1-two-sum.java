class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            hash.put(nums[i], i);
        }  
        for(int i = 0;i<nums.length; i++){
            if(hash.get(target-nums[i]) != null && hash.get(target-nums[i]) != i){
                return new int[] {i, hash.get(target-nums[i])};
            }
        }
      return null;   
   }  
}