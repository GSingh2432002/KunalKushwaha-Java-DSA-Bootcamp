//Minimum Window Substring
import java.util.*;
class Java142
{
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println("Minimum window substring: " + result);
    }
    public String minWindow(String s, String t)
    {
        if(s.length()==0 || s.length() < t.length() ) return "";

        HashMap<Character,Integer> map = new HashMap();
    }
}