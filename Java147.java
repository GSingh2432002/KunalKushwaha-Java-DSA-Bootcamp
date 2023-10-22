//Isomorphic Strings
import java.util.*;
import java.util.HashMap;
import java.util.Map;
class Java147
{
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(map1.containsKey(sChar))
            {
                if(map1.get(sChar) != tChar)
                {
                    return false;
                }
            }
            else
            {
                map1.put(sChar, tChar);
            }
            if(map2.containsKey(tChar))
            {
                if(map2.get(tChar) != sChar)
                {
                    return false;
                }
            }
            else
            {
                map2.put(tChar, sChar);
            }
        }
        return true;
    }
}