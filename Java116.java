//Longest Palindromic Substring
import java.util.*;
class Java116
{
    public static void main(String[] args) {
        String input = "acvghgvpbsb";
        String longestPalindrome = longestPalindromeString(input);
        System.out.println(input);
    }
    public static String longestPalindromeString(String s)
    {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int len1 = expandFromCentre(s,i,i+1);
            int len2 = expandFromCentre(s,i,i);
            int len = Math.max(len1, len2);
            if(end - start < len)
            {
                start =  i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end+1);
    }

    private static int expandFromCentre(String s, int i, int j)
    {
        while(i > 0 && j < s.length() && s.charAt(i) == s.charAt(j))
        {
            i--;j++;
        }
        return j-i-1;
    }
}