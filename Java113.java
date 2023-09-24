//Rotate String
import java.util.*;
class Java113
{
    public static void main(String[] args) {
        String A = "abcde";
        String B = "cdeab";
        
        boolean result = rotateString(A, B);
        System.out.println(result);
    }
    public static boolean rotateString(String a, String b)
    {
        String whole = a + b;
        if(a.length() != b.length())
        {
            return false;
        }
        if(whole.indexOf(whole) == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}