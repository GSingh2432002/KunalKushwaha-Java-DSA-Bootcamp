//Longest common Prefix
import java.util.*;
class Java131
{
    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        String ans = longestCommonString(input);
        System.out.println(ans);
    }
    public static String longestCommonString(String[] strings)
    {
        StringBuilder result = new StringBuilder();

        //Sort array
        Arrays.sort(strings);

        //get first and last string
        char[] first = strings[0].toCharArray();
        char[] last = strings[strings.length-1].toCharArray();

        //start comparing
        for(int i = 0; i < first.length; i++)
        {
            if(first[i] != last[i])
            break;
            result.append(first[i]);
        }
        return result.toString();
    }
}