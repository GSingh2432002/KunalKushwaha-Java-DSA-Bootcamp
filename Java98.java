//Valid Palindrome
import java.io.*;
class Java98
{
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
    }
    public static boolean isPalindrome(String s)
    {
        if(s == null || s.length() <= 1)
        {
            return true;
        }
        s = s.toLowerCase();
        StringBuilder b = new StringBuilder();

        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)))
            {
                b.append(s.charAt(i));
            }
        }
        
        int n = b.length() - 1;
        for(int i = 0; i < b.length()/2; i++)
        {
            if(b.charAt(i) != b.charAt(n-i))return false;
        }
        return true;
    }
}