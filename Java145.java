//Remove all adjacent duplicates
import java.util.*;
class Java145
{
    public static void main(String[] args) {
        String result = "abbaca";
        String resulString = removeDuplicates(result);
        System.out.println("Result: "+resulString);
    }
    public static String removeDuplicates(String S)
    {
        Stack<Character> stack = new Stack();
        StringBuilder b = new StringBuilder();
        for(int i=0; i<S.length(); i++)
        {
            if(!stack.isEmpty() && stack.peek() == S.charAt(i))
            {
                stack.pop();
            }
            else
            {
                stack.add(S.charAt(i));
            }
        }
        while(!stack.isEmpty())
        {
            b.append(stack.pop());
        }
        return b.reverse().toString();
    }
}