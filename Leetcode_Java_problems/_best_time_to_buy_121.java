class _best_time_to_buy_121 {
    public int maxProfit(int[] prices) {
        int buy = 9999;
        int profit = -9999;
        int sell = 0;
        int buy_index=-1, sell_index=-1;
        for (int i = 0; i < prices.length; ++i) {
            if (prices[i]<buy && sell-prices[i]>profit)
            {
                buy = prices[i];
                buy_index = i;
            }
            if(prices[i]>buy && prices[i]-buy>profit) {
                sell = prices[i];
                sell_index = i;
            }
            if(sell-buy>profit && buy_index<sell_index)
                profit = sell-buy;

        }

        if(profit!=-9999)
            return profit;
        else return 0;
    }

}
