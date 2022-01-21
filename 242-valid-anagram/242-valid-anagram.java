class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hash = new HashMap<>();
        for(int i =0;i<s.length();i++){
            if(hash.get(s.charAt(i)) == null){
              hash.put(s.charAt(i) , 1);  
            }else{
            hash.put(s.charAt(i) , hash.get(s.charAt(i))+1);
            }
        }
        for(int i =0;i<t.length();i++){
            if(hash.get(t.charAt(i)) == null){
                return false;
            }
             hash.put(t.charAt(i) , hash.get(t.charAt(i))-1);
        }
        for(int i =0;i<s.length();i++){
            if(hash.get(s.charAt(i)) != 0){
               return false;
            }
        }
        return true;
        
    }
}