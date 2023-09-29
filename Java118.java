//All Subsequences of a String
import java.util.*;
class Java118
{
    public static void main(String[] args) {
        subSequence("abc", " ", 0);
    }
    public static void subSequence(String input, String output, int index)
    {
        if(index >= input.length())
        {
            for(int i = 0; i < output.length(); i++)
            {
                System.out.print(output.charAt(i) + " ");
            }
            System.out.println();
            return;
        }

        //Including element
        output = output + input.charAt(index);
        subSequence(input, output, index+1);

        //Excluding element
        output = output.substring(0,output.length()-1);
        subSequence(input, output, index+1);
    }
}