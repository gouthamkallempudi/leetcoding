class Solution {
    public int removeDuplicates(int[] nums) {
       
       Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
       for(int i=0;i<nums.length;i++){
           if(hash.get(nums[i]) == null){
               hash.put(nums[i] , 1);
           }else{
               Integer x =  hash.get(nums[i]);
               hash.put(nums[i] , x++);
           }
       }
        Set<Integer> keys = hash.keySet();
        
        List<Integer> tree = new ArrayList<Integer>();
        tree.addAll(keys);
        Collections.sort(tree);
        
        for(int i=0;i<tree.size();i++){
            nums[i] = tree.get(i);
        }    
        
        return hash.keySet().size();
        
    }
}