class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = "";
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i <strs.length; i++){
            if(min > strs[i].length()){
                min = strs[i].length();
                first = strs[i];
            }
        }
        
        while(!first.equals("")){
            int length = first.length();
            for(int i = 0 ; i <strs.length; i++){
                if(!strs[i].startsWith(first)){
                    first = first.substring(0,first.length()-1);
                    break;
                }
            }
            if(length == first.length()){
                return first;
            }
            
        }
        return "";
    }
}