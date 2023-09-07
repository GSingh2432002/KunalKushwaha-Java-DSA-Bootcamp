//Best Time to Buy and Sell Stock II
import java.util.*;
import java.util.Arrays;
class Java90
{
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int Profit = maxProfit(arr);
        System.out.println("Maximum profit is: "+Profit);
    }
    public static int maxProfit(int[] prices)
    {
        int Profit = 0;

        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i] > prices[i-1])
            {
                Profit += prices[i] - prices[i-1];
            }
        }
        return Profit;
    }
}
