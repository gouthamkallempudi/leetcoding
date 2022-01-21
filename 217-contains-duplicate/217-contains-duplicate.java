class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i =0 ; i<nums.length ; i++){
            hash.put(nums[i], 0 );
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(hash.get(nums[i])!=0){
                return true;
            }
            hash.put(nums[i], 1);
        }
        return false;    
    }
}