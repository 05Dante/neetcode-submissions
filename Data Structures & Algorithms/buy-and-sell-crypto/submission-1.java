class Solution {
    public int maxProfit(int[] prices) {
        int beg = 0, end = prices.length-1;
        int profit = diversion(prices, beg, end);
        return profit;
    }

    private int diversion(int[] prices, int beg, int end){
        if (beg==end) return 0;
        int profit = prices[end]-prices[beg];
        int div1 = diversion(prices, beg+1, end);
        int div2 = diversion(prices, beg, end-1);
        int maxProfit = Math.max(div1, div2);
        maxProfit = Math.max(profit, maxProfit);
        return maxProfit;
        
    }
}
