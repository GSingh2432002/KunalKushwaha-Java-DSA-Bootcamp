//Word Wrap
import java.util.*;
class Java121
{
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>(Arrays.asList("leet", "code"));
        boolean result = wordBreak(s, wordDict);
        System.out.println(result);
    }
    public static boolean wordBreak(String s, List<String> wordDict)
    {
        Set<String> wordSet = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(dp[j] && wordSet.contains(s.substring(j, i)))
                {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}