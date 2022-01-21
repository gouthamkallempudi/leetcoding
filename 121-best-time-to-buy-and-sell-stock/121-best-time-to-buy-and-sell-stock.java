class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = Integer.MIN_VALUE;
        int min_element = 0;
        for(int i = 1; i<prices.length;i++){
            if(prices[i] - prices[min_element] > max_profit){
                max_profit = prices[i] - prices[min_element];
                
            }
            if(prices[i] - prices[min_element] <= 0){
                    min_element = i;
                }
        }
        if(max_profit <= 0){
            return 0;
        }
        
        return max_profit;
        
    }
}