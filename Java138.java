//First Repeated Word of String
import java.util.*;
class Java138
{
    public static void main(String[] args) {
        System.out.println(firstRepeated("Gaurav had been saying that he had been coding"));
    }
    public static String firstRepeated(String Text)
    {
        HashSet<String> set = new HashSet<String>();
        String words[] = Text.split(" ");
        for(int i =0; i<words.length; i++)
        {
            if(set.contains(words[i]))
            {
                return "First Repeated String is: " + words[i];
            }
            set.add(words[i]);
        }
        return "Word Not Found";
    }
}