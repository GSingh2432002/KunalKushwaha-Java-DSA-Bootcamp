//Minimum insertions to make string palindrome
import java.util.*;
class Java143
{
    public static void main(String[] args) {
        String s = "abcaa";
        System.out.println(minInsertion(s));
    }
    public static int lcs(String s1, String s2)
    {
        int n = s1.length();
        int m =s2.length();

        //create two arrays to store the LCS lengths
        int[] prev = new int[m + 1];
        int[] cur = new int[m + 1];

        //Base case: Initialized to 0, as no characters matched yet
        for(int ind1 = 1; ind1 <= n; ind1++)
        {
            for(int ind2 = 1; ind2 <= m; ind2++)
            {
                if(s1.charAt(ind1 - 1) == s2.charAt(ind2 - 1))
                {
                    cur[ind2] = 1 + prev[ind2 - 1];
                }
                else
                cur[ind2] = Math.max(prev[ind2], cur[ind2 - 1]);
            }
            prev = cur.clone();
        }
        //update prev array to store the current values using a clone of cur
        return prev[m];
    }

    //function to find the length of the longest palindrome subsequence
    public static int longestPalindromeSubsequence(String s)
    {
        //create a reversed version of the input string
        String reversed = new StringBuilder(s).reverse().toString();

        //calculate the LCS of the original string and its reverse
        return lcs(s, reversed);
    }

    //Function to find minimum insertions required  to make the string palindrome
    public static int minInsertion(String s)
    {
        int n = s.length();
        int k = longestPalindromeSubsequence(s);
        
        return n - k;
    }
}