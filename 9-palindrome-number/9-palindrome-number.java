class Solution {
    public boolean isPalindrome(int x) {
        
        int pal = x;
        int result = 0;
        while(pal > 0){
            result = result * 10 + (pal % 10);
            pal = pal / 10;
        }
        
        if(result == x){
            return true;
        }
        return false;
    }
}