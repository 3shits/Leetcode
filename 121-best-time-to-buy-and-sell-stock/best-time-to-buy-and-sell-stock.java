class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0 , sell = 0, diff = 0;
        for(int i = 1; i < prices.length ;i++)
        {
            if(prices[i] >= prices[buy])
            {
                if(diff < (prices[i] - prices[buy]))
                {
                    sell = i;
                    diff = prices[sell] - prices[buy];
                }
            }
            else{
            buy = i;
            }
        }
        return diff;
    }
}