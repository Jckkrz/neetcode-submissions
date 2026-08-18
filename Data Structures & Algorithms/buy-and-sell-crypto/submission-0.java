class Solution {
    public int maxProfit(int[] prices) {
        int currentMax = 0;
        int minPrice = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(prices[i] - minPrice > currentMax){
                currentMax = prices[i] - minPrice;
            }
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
        }

        return currentMax;
    }
}
