//Valid Parenthesis
import java.util.*;
import java.util.Stack;
class Java130
{
    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "(){}[]";
        String test3 = "(]";
        String test4 = "{[]}";
        System.out.println(isValid(test1));
        System.out.println(isValid(test2));
        System.out.println(isValid(test3));
        System.out.println(isValid(test4));
    }
    public static boolean isValid(String s)
    {
        //Create Stack to store opening parenthesis
        Stack<Character> stack = new Stack<>();

        //Iterate through the character in the input string
        for(char c : s.toCharArray())
        {
            if(c== '(' || c=='{' || c=='[')
            {
                //If its an opening parenthesi, push it onto the stack
                stack.add(c);
            }
            else
            {
                if(stack.isEmpty()) return false;
                // If it's a closing parenthesis, check if the stack is empty
                // or if the top of the stack does not match the current closing parenthesis
                if(c==']' && stack.peek() != '[') return false;
                if(c==')' && stack.peek() != '(') return false;
                if(c=='}' && stack.peek() != '{') return false;

                stack.pop();
            }
        }
        //After processing all characters, the stack should be empty
        return stack.isEmpty();
    }
}