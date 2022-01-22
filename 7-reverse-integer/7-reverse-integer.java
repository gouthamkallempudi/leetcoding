class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE / 10 ;
        int min = Integer.MIN_VALUE / 10 ;
        
        
        boolean isneg = false;
        if(x < 0){
           isneg = true;
           x = Math.abs(x); 
        }
        int res = 0;
        while(x > 0 ){
            if(res > max || res < min){
                return 0;
            } 
            res = (res*10) + (x%10);
            x = x/10;
        }
        
        
       if(isneg){
           return -res;
       } 
       return res; 
        
    }
}