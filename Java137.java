//Minimum number of flips to make binary string alternate
import java.util.*;
class Java137
{
    public static void main(String[] args) {
        String binaryString = "111000";
        int minFlips = minFlips(binaryString);
        System.out.println("Min Flips: "+minFlips+"\n");

    }
    public static int minFlips(String S)
    {
        int flips = 0;
        for(int i=1; i<S.length(); i++)
        {
            if(i%2 == 0)
            {
                if(S.charAt(i)=='0') flips++;
            }
            else if(i%2!=0)
            {
                if(S.charAt(i)=='1') flips++;
            }
        }
        return Math.min(flips,S.length()-flips);
    }
}