class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestBuy = prices[0];
        for(int i = 1;i<prices.length;i++){
          int  currentProfit=prices[i]-bestBuy;
            if(currentProfit>maxProfit){
                maxProfit = currentProfit;
            }
            if(prices[i]<bestBuy){
                bestBuy = prices[i];
            }
        }
        return maxProfit;
    }
}