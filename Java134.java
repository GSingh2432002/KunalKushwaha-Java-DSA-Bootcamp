//Count the Number of Consistent Strings\
import java.util.*;
class Java134
{
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc", "def"};

        int result = countConsistentStrings(allowed, words);
        System.out.println("Number of consistent strings: " + result);
    }
    public static int countConsistentStrings(String allowed, String[] words)
    {
        int counter = 0;
        HashSet<Character> set = new HashSet<Character>();
        for(int i =0; i < allowed.length(); i++)
        {
            set.add(allowed.charAt(i));
        }
        for(String str: words)
        {
            boolean flag = true;
            for(int i=0; i<str.length();i++)
            {
                if(!set.contains(str.charAt(i)))
                {
                    flag = false;
                }
            }
            if(flag) counter++;
        }
        return counter;
    }
}