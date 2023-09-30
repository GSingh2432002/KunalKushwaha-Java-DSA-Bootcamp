//Count Binary Substrings
import java.util.*;
class Java120
{
    public static void main(String[] args) {
        String input = "00110";
        int result = countBinarySubstring(input);
        System.out.println(result);
    }
    public static int countBinarySubstring(String s)
    {
        int prevGroupLength = 0;
        int currentGroupLength = 1;
        int count = 0;

        for(int i = 1; i < s.length(); i++)
        {
            if(s.charAt(i) == s.charAt(i - 1))
            {
                currentGroupLength++;
            }
            else
            {
                prevGroupLength = currentGroupLength;
                currentGroupLength = 1;
            }

            if(prevGroupLength >= currentGroupLength)
            {
                count++;
            }
        }
        return count;
    }
}