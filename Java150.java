//Perfect Square
import java.util.*;
class Java150
{
    public static void main(String[] args) {
        int n = 12;
        int result = mySqrt(n);
        System.out.println("The square root of "+n+" is: " +result);
    }
    public static int mySqrt(int n)
    {
        if (n <= 0) {
            return 0;
        }
        
        int[] dp = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        
        return dp[n];
    }
}