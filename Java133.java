//Minimum number of swaps to make the string balanced
import java.util.*;
class Java133
{
    public static void main(String[] args) {
        
    }
    public static int minSwaps(String s)
    {
        int open =0, close = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '[')
            {
                open++;
            }
            else
            {
                if(open<=0)
                {
                    close++;
                }
                else
                {
                    open--;
                }
            }
        }
        return (close+1)/2;
    }
}