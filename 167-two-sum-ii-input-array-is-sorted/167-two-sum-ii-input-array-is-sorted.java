class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i = 0 ; i<numbers.length ; i++){
            hash.put(numbers[i] , i+1);
        }
        for(int i = 0 ; i<numbers.length ; i++){
            
            if(hash.get(target -numbers[i])!=null){
                return new int[] {i+1 , hash.get(target -numbers[i]) };
            }
           
        }
        return null;
    }
}