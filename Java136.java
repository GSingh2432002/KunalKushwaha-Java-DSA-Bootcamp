//Roman to Integer
import java.util.*;
class Java136
{
    public static void main(String[] args) {
        String romanNumeral = "XX"; // You can change this to test with other Roman numerals
        int result = romantoDecimal(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
    }
    public static int romantoDecimal(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int n = s.length();
        int output = 0;
        for(int i = 0; i<n; i++)
        {
            if(i<n-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
            {
                output += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                i++;
            }
            else    
            {
                output += map.get(s.charAt(i));
            }
        }
        return output;
    }
}