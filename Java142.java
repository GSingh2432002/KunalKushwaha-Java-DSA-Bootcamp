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
    public static String minWindow(String s, String t)
    {
        if(s.length()==0 || s.length() < t.length() ) return "";

        HashMap<Character,Integer> map = new HashMap();
        for(char c : t.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        int count = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        int minleft = 0;

        for(int i=0; i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))>=0)
            {
                count++;
            }
            }
            while(count==t.length())
            {
                if(minLength>i-start+1)
                {
                    minLength = i-start+1;
                    minleft = start;
                }
                if(map.containsKey(s.charAt(start)))
                {
                    map.put(s.charAt(start),map.get(s.charAt(start))+1);
                    if(map.get(s.charAt(start))>0){count--;}
                }
                start++;
            }
        }
        if(minLength>s.length())return "";
        return s.substring(minleft,minleft+minLength);
    }
}