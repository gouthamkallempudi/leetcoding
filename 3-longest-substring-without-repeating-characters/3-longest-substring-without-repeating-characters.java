class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int current = 0;
        int longest = 0;
        Map<Character, Integer> hash = new HashMap<>();
        
        while(i<s.length() && j<s.length()){
           // System.out.println(s.charAt(i));
            if(hash.get(s.charAt(i)) == null ){
                hash.put(s.charAt(i), 1);
                i++;
                current++;
            }else{
               hash.put(s.charAt(j), null);
               j++;
                current--;
            }
            if(current>longest){
                longest = current;
            }
            //System.out.println(current);
        }
        
        return longest;
        
    } 
}