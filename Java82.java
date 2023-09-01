//Best time to buy and sell stocks
class Java82
{
    public static void main(String[] args) {
        // Example input prices
        int[] prices = {7, 1, 5, 3, 6, 4}; 
        int maxProfit = maxProfit(prices);
        System.out.println("Max Profit: " + maxProfit);
    }
        public static int maxProfit(int[] prices) {
            if(prices.length==0)return 0;
            int profit = 0;
            int min = prices[0];
            int max = 0;
    
            for(int stockprice:prices)
            {
                min = Math.min(min,stockprice);
                profit = stockprice-min;
                max = Math.max(profit,max);
            }
            return max;
        }
}