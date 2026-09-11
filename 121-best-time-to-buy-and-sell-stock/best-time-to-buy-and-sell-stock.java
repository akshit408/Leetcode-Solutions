class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i = n - 1;
        int max = 0;
        
        for(int j = n - 1; j >= 0; j--){
            if(prices[j] > prices[i]){
                i = j;
            }
            int diff = prices[i] - prices[j];
            max = Math.max(max, diff);
            
        }
            return max;
    }
}