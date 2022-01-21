class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> hash = new HashMap<>();
        for(int i =0;i<ransomNote.length();i++){
            if(hash.get(ransomNote.charAt(i)) == null){
                hash.put(ransomNote.charAt(i) , 1);
            }else{
                 hash.put(ransomNote.charAt(i) , hash.get(ransomNote.charAt(i))+1);
            }
        }
        
        for(int i =0;i<magazine.length();i++){
           if(hash.get(magazine.charAt(i)) != null){
                hash.put(magazine.charAt(i) , hash.get(magazine.charAt(i))-1);
            } 
        }
        
        for(int i =0;i<ransomNote.length();i++){
            if(hash.get(ransomNote.charAt(i)) > 0){
                return false;
            }
        }
        return true;
    }
}